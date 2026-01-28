package com.yang.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 修改短链接分组请求参数
 *
 * @author YangTing
 * @since 2026/1/29 7:07
 */
@Data
public class GroupUpdateReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;
}
