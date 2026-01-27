package com.yang.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 短链接分组列表返回参数
 *
 * @author YangTing
 * @since 2026/1/27 9:08
 */
@Data
public class GroupListRespDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 创建分组用户名
     */
    private String username;

    /**
     * 分组排序
     */
    private Integer sortOrder;
}
