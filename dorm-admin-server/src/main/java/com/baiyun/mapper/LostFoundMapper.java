package com.baiyun.mapper;

import com.baiyun.entity.LostFound;
import java.util.List;

public interface LostFoundMapper {
    int insertLostFound(LostFound lostFound);
    List<LostFound> selectAll();
    List<LostFound> selectByType(String type);
    int updateStatus(Long id, String status);
    int deleteById(Long id);
} 