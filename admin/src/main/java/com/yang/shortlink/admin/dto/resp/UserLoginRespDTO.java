package com.yang.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录响应参数
 *
 * @author YangTing
 * @since 2026/1/25 20:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRespDTO {
    /**
     * 登录成功后返回的 token
     */
    private String token;
}
