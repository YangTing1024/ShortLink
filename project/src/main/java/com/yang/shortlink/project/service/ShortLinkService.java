package com.yang.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.shortlink.project.dao.entity.ShortLinkDO;
import com.yang.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.yang.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * 短链接接口服务层
 *
 * @author YangTing
 * @since 2026/2/2 10:38
 */
public interface ShortLinkService extends IService<ShortLinkDO> {

    /**
     * 创建短链接
     * @param requestParam 短链接请求参数
     * @return 短链接响应参数
     */
    ShortLinkCreateRespDTO create(ShortLinkCreateReqDTO requestParam);

}
