package com.baiyun.service;

import com.baiyun.entity.DormEvaluation;
import java.util.List;

public interface DormEvaluationService {
    void addEvaluation(DormEvaluation evaluation);
    List<DormEvaluation> getByDormId(Long dormId);
    List<DormEvaluation> getAll();
} 