package com.baiyun.service.impl;

import com.baiyun.entity.LostFound;
import com.baiyun.mapper.LostFoundMapper;
import com.baiyun.service.LostFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LostFoundServiceImpl implements LostFoundService {
    @Autowired
    private LostFoundMapper lostFoundMapper;

    @Override
    public void addLostFound(LostFound lostFound) {
        lostFoundMapper.insertLostFound(lostFound);
    }

    @Override
    public List<LostFound> getAllLostFound() {
        return lostFoundMapper.selectAll();
    }

    @Override
    public List<LostFound> getLostFoundByType(String type) {
        return lostFoundMapper.selectByType(type);
    }

    @Override
    public void updateStatus(Long id, String status) {
        lostFoundMapper.updateStatus(id, status);
    }

    @Override
    public void deleteLostFound(Long id) {
        lostFoundMapper.deleteById(id);
    }
} 