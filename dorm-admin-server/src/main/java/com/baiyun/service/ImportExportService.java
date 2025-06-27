package com.baiyun.service;

import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;

public interface ImportExportService {
    void importStudents(MultipartFile file);
    void exportStudents(HttpServletResponse response);
    void importDorms(MultipartFile file);
    void exportDorms(HttpServletResponse response);
    // 可扩展更多实体的导入导出
} 