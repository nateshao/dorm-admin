package com.baiyun.mapper;

import com.baiyun.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @date Created by 邵桐杰 on 2022/5/17 11:24
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * TODO
     */
    @Test
    void getStudentByName() {
        List<Student> studentList = studentMapper.getStudentByName("千羽");
        studentList.stream().forEach(list-> System.out.println("list = " + list));
    }

    @Test
    @Transactional
    void saveStudent() {
    }

    @Test
    @Transactional
    void editStudent() {
    }

    @Test
    @Transactional
    void deleteStudents() {
    }
}