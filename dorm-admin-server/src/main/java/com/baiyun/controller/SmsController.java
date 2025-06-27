package com.baiyun.controller;

import com.baiyun.service.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "短信平台对接")
@RestController
@RequestMapping("/api/thirdparty/sms")
public class SmsController {
    @Autowired
    private SmsService smsService;

    @ApiOperation("发送短信")
    @PostMapping("/send")
    public String send(@RequestParam String phone, @RequestParam String content) {
        boolean result = smsService.sendSms(phone, content);
        return result ? "发送成功" : "发送失败";
    }
} 