package com.yang.shortlink.admin.controller;

import com.yang.shortlink.admin.common.convention.Result;
import com.yang.shortlink.admin.common.convention.Results;
import com.yang.shortlink.admin.dto.req.UserLoginReqDTO;
import com.yang.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.yang.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.yang.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.yang.shortlink.admin.dto.resp.UserRespDTO;
import com.yang.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 *
 * @author YangTing
 * @since 2026/1/18 22:34
 */
@RestController
@RequestMapping("/api/shortLink/admin/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查找用户信息
     */
    @GetMapping("/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 用户名是否可用
     */
    @GetMapping("/availableUsername")
    public Result<Boolean> availableUsername(@RequestParam("username") String username) {
        return Results.success(userService.availableUsername(username));
    }

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    /**
     * 根据用户名修改用户信息
     */
    @PutMapping()
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userService.login(requestParam));
    }

    /**
     * 校验登录
     */
    @GetMapping("/check-login")
    public Result<Boolean> checkLogin(@RequestParam("username") String username,
                                      @RequestParam("token") String token) {
        return Results.success(userService.checkLogin(username, token));
    }

    /**
     * 退出登录
     */
    @DeleteMapping("/logout")
    public Result<Void> logout(@RequestParam("username") String username,
                                      @RequestParam("token") String token) {
        userService.logout(username, token);
        return Results.success();
    }
}