package com.baiyun.service;

public interface ThirdPartyCardService {
    boolean syncCardInfo(String studentNo);
    boolean checkAccess(String cardNo, String doorId);
} 