package com.yang.shortlink.admin.controller;

import com.yang.shortlink.admin.common.convention.Result;
import com.yang.shortlink.admin.common.convention.Results;
import com.yang.shortlink.admin.dto.resp.UserRespDTO;
import com.yang.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author YangTing
 * @since 2026/1/18 22:34
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查找用户信息
     */
    @GetMapping("/api/shortLink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }
}