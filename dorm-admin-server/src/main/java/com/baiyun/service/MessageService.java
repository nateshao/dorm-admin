package com.baiyun.service;

import com.baiyun.entity.Message;
import java.util.List;

public interface MessageService {
    void sendMessage(Message message);
    List<Message> getMessagesByUser(Long userId);
    List<Message> getUnreadMessagesByUser(Long userId);
    void updateStatus(Long id, String status);
} 