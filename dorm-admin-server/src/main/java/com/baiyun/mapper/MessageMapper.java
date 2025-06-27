package com.baiyun.mapper;

import com.baiyun.entity.Message;
import java.util.List;

public interface MessageMapper {
    int insertMessage(Message message);
    List<Message> selectByUserId(Long userId);
    List<Message> selectUnreadByUserId(Long userId);
    int updateStatus(Long id, String status);
} 