package com.baiyun.service.impl;

import com.baiyun.service.ThirdPartyCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MockThirdPartyCardServiceImpl implements ThirdPartyCardService {
    private static final Logger logger = LoggerFactory.getLogger(MockThirdPartyCardServiceImpl.class);
    @Override
    public boolean syncCardInfo(String studentNo) {
        logger.info("[MockCard] 同步一卡通信息: {}", studentNo);
        return true;
    }
    @Override
    public boolean checkAccess(String cardNo, String doorId) {
        logger.info("[MockCard] 校验门禁: cardNo={}, doorId={}", cardNo, doorId);
        return true;
    }
} 