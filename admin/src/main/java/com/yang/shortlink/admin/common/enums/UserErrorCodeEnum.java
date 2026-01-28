package com.yang.shortlink.admin.common.enums;

import com.yang.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * 用户错误码枚举
 *
 * @author YangTing
 * @since 2026/1/19 11:23
 */
public enum UserErrorCodeEnum implements IErrorCode {

    USER_NULL("B00020O", "用户记录不存在"),

    USER_NAME_EXIST("B000201", "用户名已存在"),

    USER_EXIST("B000202", "用户已存在"),

    USER_SAVE_ERROR("B000203", "用户保存失败"),

    USER_UNAUTHORIZED("401", "未授权");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
