package com.yang.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yang.shortlink.project.common.database.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 短链接信息表
 *
 * @author YangTing
 * @since 2026/2/2
 */
@Data
@TableName("link")
@EqualsAndHashCode(callSuper = true)
public class ShortLinkDO extends BaseDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * 短链接
     */
    private String shortUri;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 点击量
     */
    private Integer clickNum;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 启用标识 0：已启用 1：未启用
     */
    private Integer enableStatus;

    /**
     * 创建类型 0：接口 1：控制台
     */
    private Integer createdType;

    /**
     * 有效期类型 0：永久有效 1：用户自定义
     */
    private Integer validDateType;

    /**
     * 有效期
     */
    private Date validDate;

    /**
     * 描述
     */
    private String describe;
}