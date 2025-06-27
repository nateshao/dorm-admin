package com.baiyun.controller;

import com.baiyun.service.ThirdPartyCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/thirdparty/card")
public class ThirdPartyCardController {
    @Autowired
    private ThirdPartyCardService cardService;

    @PostMapping("/sync")
    public String syncCard(@RequestParam String studentNo) {
        boolean result = cardService.syncCardInfo(studentNo);
        return result ? "同步成功" : "同步失败";
    }

    @GetMapping("/check")
    public String checkAccess(@RequestParam String cardNo, @RequestParam String doorId) {
        boolean result = cardService.checkAccess(cardNo, doorId);
        return result ? "允许通行" : "禁止通行";
    }
} 