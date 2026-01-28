package com.yang.shortlink.admin.common.biz.user;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.yang.shortlink.admin.common.convention.exception.ClientException;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.IOException;

/**
 * 用户信息传输过滤器
 *
 * @author YangTing
 * @since 2026/1/27 9:41
 */
@RequiredArgsConstructor
public class UserTransmitFilter implements Filter {

    private final StringRedisTemplate stringRedisTemplate;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String requestUri = httpServletRequest.getRequestURI();
        if(!ObjectUtil.equals(requestUri, "/api/shortLink/v1/user/login")){
            String username = httpServletRequest.getHeader("username");
            String token = httpServletRequest.getHeader("token");
            if(username == null || token == null){
                throw new ClientException("用户未登录或Token不存在");
            }
            Object userInfoJson = stringRedisTemplate.opsForHash().get("login_" + username, token);
            if (userInfoJson != null) {
                UserInfoDTO userInfoDTO = JSONUtil.toBean(userInfoJson.toString(), UserInfoDTO.class);
                UserContext.setUser(userInfoDTO);
            }
        }
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            UserContext.removeUser();
        }
    }
}
