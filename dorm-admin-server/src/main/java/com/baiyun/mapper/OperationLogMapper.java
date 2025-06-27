package com.baiyun.mapper;

import com.baiyun.entity.OperationLog;
import java.util.List;

public interface OperationLogMapper {
    int insertLog(OperationLog log);
    List<OperationLog> selectByUserId(Long userId);
    List<OperationLog> selectAll();
} 