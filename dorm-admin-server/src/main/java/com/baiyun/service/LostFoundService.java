package com.baiyun.service;

import com.baiyun.entity.LostFound;
import java.util.List;

public interface LostFoundService {
    void addLostFound(LostFound lostFound);
    List<LostFound> getAllLostFound();
    List<LostFound> getLostFoundByType(String type);
    void updateStatus(Long id, String status);
    void deleteLostFound(Long id);
} 