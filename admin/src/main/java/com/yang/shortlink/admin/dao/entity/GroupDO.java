package com.yang.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yang.shortlink.admin.common.database.BaseDO;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * 短链接分组表
 *
 * @author YangTing
 * @since 2026/1/26 20:12
 */
@Data
@TableName("`group`")
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupDO extends BaseDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

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