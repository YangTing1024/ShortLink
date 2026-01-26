package com.yang.shortlink.admin.toolkit;

import java.security.SecureRandom;

/**
 * 随机数生成工具类
 *
 * @author YangTing
 * @since 2026/1/26 21:32
 */
public final class RandomCodeUtil {

    private RandomCodeUtil() {
        // 工具类禁止实例化
    }

    /** 数字字符集 */
    private static final String DIGITS = "0123456789";

    /** 字母字符集（大小写） */
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /** 数字 + 字母 */
    private static final String ALPHANUMERIC = DIGITS + LETTERS;

    /** 默认长度 */
    private static final int DEFAULT_LENGTH = 6;

    /** 安全随机数 */
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * 生成 6 位纯数字随机码
     */
    public static String numeric() {
        return generate(DIGITS, DEFAULT_LENGTH);
    }

    /**
     * 生成 6 位纯字母随机码
     */
    public static String letters() {
        return generate(LETTERS, DEFAULT_LENGTH);
    }

    /**
     * 生成 6 位数字 + 字母随机码
     */
    public static String alphanumeric() {
        return generate(ALPHANUMERIC, DEFAULT_LENGTH);
    }

    /**
     * 自定义字符集 + 长度
     *
     * @param chars  字符集
     * @param length 长度
     */
    public static String generate(String chars, int length) {
        if (chars == null || chars.isEmpty()) {
            throw new IllegalArgumentException("字符集不能为空");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("长度必须大于 0");
        }

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }
}