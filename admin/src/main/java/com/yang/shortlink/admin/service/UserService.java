package com.yang.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.shortlink.admin.dao.entity.UserDO;
import com.yang.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.yang.shortlink.admin.dto.req.UserUpdateReqDTO;
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

    /**
     * 用户名是否可用
     *
     * @param username 用户名
     * @return 是否可用
     */
    Boolean availableUsername(String username);

    /**
     * 用户注册
     *
     * @param requestParam 注册参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户信息
     *
     * @param requestParam 修改参数
     */
    void update( UserUpdateReqDTO requestParam);
}
