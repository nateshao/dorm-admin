package com.baiyun.controller;

import com.baiyun.model.ResponseMsg;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    @GetMapping("/login")
    public ResponseMsg login() {
        return ResponseMsg.error("尚未登录！请登录");
    }
}
