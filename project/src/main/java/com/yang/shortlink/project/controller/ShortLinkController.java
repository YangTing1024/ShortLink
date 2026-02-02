package com.yang.shortlink.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接控制层
 *
 * @author YangTing
 * @since 2026/2/2 10:41
 */
@RestController
@RequestMapping("/api/shortLink/project/v1")
public class ShortLinkController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

}
