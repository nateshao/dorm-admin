package com.baiyun.controller;

import com.baiyun.service.ImportExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/importexport")
public class ImportExportController {
    @Autowired
    private ImportExportService importExportService;

    @PostMapping("/import/students")
    public String importStudents(@RequestParam("file") MultipartFile file) {
        importExportService.importStudents(file);
        return "success";
    }

    @GetMapping("/export/students")
    public void exportStudents(HttpServletResponse response) {
        importExportService.exportStudents(response);
    }

    @PostMapping("/import/dorms")
    public String importDorms(@RequestParam("file") MultipartFile file) {
        importExportService.importDorms(file);
        return "success";
    }

    @GetMapping("/export/dorms")
    public void exportDorms(HttpServletResponse response) {
        importExportService.exportDorms(response);
    }
} 