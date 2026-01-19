package com.yang.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 用户信息返回对象
 *
 * @author YangTing
 * @since 2026/1/19 9:35
 */
@Data
public class UserRespDTO {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
