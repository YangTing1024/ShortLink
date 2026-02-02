package com.yang.shortlink.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.shortlink.project.dao.entity.ShortLinkDO;
import com.yang.shortlink.project.dao.mapper.ShortLinkMapper;
import com.yang.shortlink.project.service.ShortLinkService;
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
}
