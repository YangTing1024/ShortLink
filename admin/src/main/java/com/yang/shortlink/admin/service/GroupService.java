package com.yang.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.shortlink.admin.dao.entity.GroupDO;
import com.yang.shortlink.admin.dto.req.GroupSaveReqDTO;
import com.yang.shortlink.admin.dto.req.GroupSortReqDTO;
import com.yang.shortlink.admin.dto.req.GroupUpdateReqDTO;
import com.yang.shortlink.admin.dto.resp.GroupListRespDTO;

import java.util.List;

/**
 * 短链接分组Service层
 *
 * @author YangTing
 * @since 2026/1/26 21:25
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 保存短链接分组
     *
     * @param requestParam 请求参数
     */
    void saveGroup(GroupSaveReqDTO requestParam);

    /**
     * 短链接分组列表
     *
     * @return 短链接分组列表返回参数
     */
    List<GroupListRespDTO> listGroup();

    /**
     * 修改短链接分组
     *
     * @param requestParam 请求参数
     */
    void updateGroup(GroupUpdateReqDTO requestParam);

    /**
     * 修改短链接分组
     *
     * @param gid gid
     */
    void deleteGroup(String gid);

    void sortGroup(List<GroupSortReqDTO> requestParam);
}
