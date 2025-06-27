package com.baiyun.service;

import com.baiyun.entity.OperationLog;
import java.util.List;

public interface OperationLogService {
    void addLog(OperationLog log);
    List<OperationLog> getLogsByUser(Long userId);
    List<OperationLog> getAllLogs();
} 