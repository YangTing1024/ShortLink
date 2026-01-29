package com.yang.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 分组排序请求参数
 *
 * @author YangTing
 * @since 2026/1/29 11:31
 */
@Data
public class GroupSortReqDTO {
    /**
     * 分组标识
     */
    private String gid;
    /**
     * 分组排序
     */
    private Integer sortOrder;
}
