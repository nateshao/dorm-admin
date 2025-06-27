package com.baiyun.service;

public interface SmsService {
    boolean sendSms(String phone, String content);
} 