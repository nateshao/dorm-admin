package com.baiyun.service.impl;

import com.baiyun.service.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MockSmsServiceImpl implements SmsService {
    private static final Logger logger = LoggerFactory.getLogger(MockSmsServiceImpl.class);
    @Override
    public boolean sendSms(String phone, String content) {
        logger.info("[MockSms] 发送短信到:{} 内容:{}", phone, content);
        return true;
    }
} 