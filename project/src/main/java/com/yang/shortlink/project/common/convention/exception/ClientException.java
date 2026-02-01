package com.yang.shortlink.project.common.convention.exception;

import com.yang.shortlink.project.common.convention.errorcode.BaseErrorCode;
import com.yang.shortlink.project.common.convention.errorcode.IErrorCode;

/**
 * 客户端异常
 *
 * @author YangTing
 * @since 2026/1/19 11:13
 */
public class ClientException extends AbstractException {

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
