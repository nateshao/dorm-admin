package com.baiyun.controller;

import com.baiyun.service.ThirdPartyCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "一卡通与门禁对接")
@RestController
@RequestMapping("/api/thirdparty/card")
public class ThirdPartyCardController {
    @Autowired
    private ThirdPartyCardService cardService;

    @ApiOperation("同步一卡通信息")
    @PostMapping("/sync")
    public String syncCard(@RequestParam String studentNo) {
        boolean result = cardService.syncCardInfo(studentNo);
        return result ? "同步成功" : "同步失败";
    }

    @ApiOperation("校验门禁权限")
    @GetMapping("/check")
    public String checkAccess(@RequestParam String cardNo, @RequestParam String doorId) {
        boolean result = cardService.checkAccess(cardNo, doorId);
        return result ? "允许通行" : "禁止通行";
    }
} 