package com.yang.shortlink.project.controller;

import com.yang.shortlink.project.common.convention.Result;
import com.yang.shortlink.project.common.convention.Results;
import com.yang.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.yang.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.yang.shortlink.project.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接控制层
 *
 * @author YangTing
 * @since 2026/2/2 10:41
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/shortLink/v1")
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    /**
     * 创建短链接
     */
    @PostMapping
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam){
        return Results.success(shortLinkService.create(requestParam));
    }

}
