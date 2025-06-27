package com.baiyun.mapper;

import com.baiyun.entity.DormEvaluation;
import java.util.List;

public interface DormEvaluationMapper {
    int insertEvaluation(DormEvaluation evaluation);
    List<DormEvaluation> selectByDormId(Long dormId);
    List<DormEvaluation> selectAll();
} 