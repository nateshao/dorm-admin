package com.baiyun.service;

import com.baiyun.entity.DormScore;
import java.util.List;

public interface DormScoreService {
    void addScore(DormScore score);
    void updateScore(DormScore score);
    DormScore getByDormId(Long dormId);
    List<DormScore> getAll();
} 