package com.yang.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.shortlink.admin.dao.entity.GroupDO;
import com.yang.shortlink.admin.dao.mapper.GroupMapper;
import com.yang.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 短链接分组实现层
 *
 * @author YangTing
 * @since 2026/1/26 21:25
 */
@Service
@Slf4j
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
}
