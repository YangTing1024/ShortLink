package com.yang.shortlink.admin.common.constant;

/**
 * Redis缓存常量类
 *
 * @author YangTing
 * @since 2026/1/20 10:54
 */
public class RedisCacheConstant {
    /**
     * 用户注册缓存击穿锁
     */
    public static final String LOCK_USER_REGISTER_KEY = "short-link:lock_user_register:";
}
