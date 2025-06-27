package com.baiyun.controller;

import com.baiyun.service.SmsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(SmsController.class)
public class SmsControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private SmsService smsService;

    @Test
    public void testSendSms() throws Exception {
        Mockito.when(smsService.sendSms("13800000000", "hello")).thenReturn(true);
        mockMvc.perform(post("/api/thirdparty/sms/send")
                .param("phone", "13800000000")
                .param("content", "hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("发送成功"));
    }
} 