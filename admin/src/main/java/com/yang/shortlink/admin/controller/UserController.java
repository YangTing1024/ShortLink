package com.yang.shortlink.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 * @author YangTing
 * @since 2026/1/18 22:34
 */
@RestController
public class UserController {

    /**
     * 根据用户名查找用户信息
     */
    @GetMapping("/api/shortLink/v1/user/{username}")
    public String getUserByUsername(@PathVariable("username") String username) {
        // 模拟根据用户名查询用户信息
        return "用户：" + username;
    }
}