package com.yang.shortlink.admin.controller;

import com.yang.shortlink.admin.common.convention.Result;
import com.yang.shortlink.admin.common.convention.Results;
import com.yang.shortlink.admin.dto.req.GroupSaveReqDTO;
import com.yang.shortlink.admin.dto.resp.GroupListRespDTO;
import com.yang.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 短链接分组控制层
 *
 * @author YangTing
 * @since 2026/1/26 21:26
 */
@RestController
@RequestMapping("/api/shortLink/v1/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping
    public Result<Void> saveGroup(@RequestBody GroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam);
        return Results.success();
    }

    /**
     * 短链接分组列表
     */
    @GetMapping("/list")
    public Result<List<GroupListRespDTO>> listGroup(){
        return Results.success(groupService.listGroup());
    }
}
