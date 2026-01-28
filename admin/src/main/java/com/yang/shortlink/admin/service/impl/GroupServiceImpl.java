package com.yang.shortlink.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.shortlink.admin.common.biz.user.UserContext;
import com.yang.shortlink.admin.dao.entity.GroupDO;
import com.yang.shortlink.admin.dao.mapper.GroupMapper;
import com.yang.shortlink.admin.dto.req.GroupSaveReqDTO;
import com.yang.shortlink.admin.dto.resp.GroupListRespDTO;
import com.yang.shortlink.admin.service.GroupService;
import com.yang.shortlink.admin.toolkit.RandomCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 短链接分组实现层
 *
 * @author YangTing
 * @since 2026/1/26 21:25
 */
@Service
@Slf4j
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
    @Override
    public void saveGroup(GroupSaveReqDTO requestParam) {
        String gid ;
        do{
            gid = RandomCodeUtil.alphanumeric();
        }while (hasGroup(gid));
        GroupDO groupDO = GroupDO.builder()
                .gid(gid)
                .username(UserContext.getUsername())
                .name(requestParam.getName())
                .sortOrder(0)
                .build();
        baseMapper.insert(groupDO);
    }

    private boolean hasGroup(String gid) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                .eq(GroupDO::getUsername, UserContext.getUsername());
        GroupDO groupDO = baseMapper.selectOne(queryWrapper);
        return  groupDO != null;
    }

    @Override
    public List<GroupListRespDTO> listGroup() {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(GroupDO::getDelFlag, 0)
                .orderByDesc(List.of(GroupDO::getSortOrder, GroupDO::getUpdateTime));
        List<GroupDO> groupDOList = baseMapper.selectList(queryWrapper);
        return BeanUtil.copyToList(groupDOList, GroupListRespDTO.class);
    }
}
