package com.yang.shortlink.project.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.shortlink.project.dao.entity.ShortLinkDO;
import com.yang.shortlink.project.dao.mapper.ShortLinkMapper;
import com.yang.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.yang.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.yang.shortlink.project.service.ShortLinkService;
import com.yang.shortlink.project.toolkit.HashUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 短链接接口实现类
 *
 * @author YangTing
 * @since 2026/2/2 10:39
 */
@Service
@Slf4j
public class ShortLinkServiceImpl extends ServiceImpl<ShortLinkMapper, ShortLinkDO> implements ShortLinkService {

    @Override
    public ShortLinkCreateRespDTO create(ShortLinkCreateReqDTO requestParam) {
        String linkSuffix = generateLinkSuffix(requestParam);
        ShortLinkDO shortLinkDO = BeanUtil.toBean(requestParam, ShortLinkDO.class);
        shortLinkDO.setFullShortUrl(requestParam.getDomain() + "/" + linkSuffix);
        shortLinkDO.setShortUri(linkSuffix);
        shortLinkDO.setEnableStatus(0);
        baseMapper.insert(shortLinkDO);
        return ShortLinkCreateRespDTO.builder()
                .gid(requestParam.getGid())
                .fullShortUrl(shortLinkDO.getFullShortUrl())
                .originUrl(requestParam.getOriginUrl())
                .build();
    }

    private String generateLinkSuffix(ShortLinkCreateReqDTO requestParam){
        String originUrl = requestParam.getOriginUrl();
        return HashUtil.hashToBase62(originUrl);
    }
}
