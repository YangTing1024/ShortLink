package com.yang.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.shortlink.admin.dao.entity.UserDO;
import com.yang.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 *
 * @author YangTing
 * @since 2026/1/19 9:31
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    UserRespDTO getUserByUsername(String username);

}
