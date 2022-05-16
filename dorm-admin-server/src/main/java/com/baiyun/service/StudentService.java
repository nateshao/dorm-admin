package com.baiyun.service;

import com.github.pagehelper.PageInfo;
import com.baiyun.mapper.StudentMapper;
import com.baiyun.entity.Student;
import com.baiyun.model.ResponsePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.github.pagehelper.page.PageMethod.startPage;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentDao;

    public ResponsePage getStudentByName(Integer page, Integer size, String studentName) {
        startPage(page, size);
        List<Student> students = studentDao.getStudentByName(studentName);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        ResponsePage responsePage = new ResponsePage();
        responsePage.setData(students);
        responsePage.setTotal(pageInfo.getTotal());
        return responsePage;
    }

    public int saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    public int editStudent(Student student) {
        return studentDao.editStudent(student);
    }

    public int deleteStudents(List<Student> students) {
        List<Integer> ids = new ArrayList<>();
        for (Student student : students) {
            ids.add(student.getId());
        }
        return studentDao.deleteStudents(ids);
    }
}
