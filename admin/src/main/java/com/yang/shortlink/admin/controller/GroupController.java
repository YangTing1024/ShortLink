package com.yang.shortlink.admin.controller;

import com.yang.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 *
 * @author YangTing
 * @since 2026/1/26 21:26
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

}
