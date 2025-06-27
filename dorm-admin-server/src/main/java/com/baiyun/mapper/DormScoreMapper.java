package com.baiyun.mapper;

import com.baiyun.entity.DormScore;
import java.util.List;

public interface DormScoreMapper {
    int insertScore(DormScore score);
    int updateScore(DormScore score);
    DormScore selectByDormId(Long dormId);
    List<DormScore> selectAll();
} 