package com.baiyun.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baiyun.entity.Student;
import com.baiyun.mapper.StudentMapper;
import com.baiyun.service.ImportExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@Service
public class ImportExportServiceImpl implements ImportExportService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void importStudents(MultipartFile file) {
        try {
            List<Student> students = EasyExcel.read(file.getInputStream())
                    .head(Student.class)
                    .sheet()
                    .doReadSync();
            for (Student student : students) {
                studentMapper.saveStudent(student);
            }
        } catch (IOException e) {
            throw new RuntimeException("导入失败", e);
        }
    }

    @Override
    public void exportStudents(HttpServletResponse response) {
        try {
            List<Student> students = studentMapper.getStudentByName("");
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("学生数据", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            EasyExcel.write(response.getOutputStream(), Student.class).sheet("学生信息").doWrite(students);
        } catch (IOException e) {
            throw new RuntimeException("导出失败", e);
        }
    }

    @Override
    public void importDorms(MultipartFile file) {
        // TODO: 宿舍导入实现
    }

    @Override
    public void exportDorms(HttpServletResponse response) {
        // TODO: 宿舍导出实现
    }
} 