package com.yang.shortlink.admin.common.convention.errorcode;

/**
 * 平台错误码
 *
 * @author YangTing
 * @since 2026/1/19 11:10
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
