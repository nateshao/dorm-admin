package com.baiyun.mapper;

import com.baiyun.entity.Dorm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @date Created by 邵桐杰 on 2022/5/17 11:23
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
@SpringBootTest
class DormMapperTest {
    @Autowired
    private DormMapper dormMapper;

    @Test
    void getDormAll() {
        List<Dorm> dormList = dormMapper.getDormAll();
//        dormList.stream().forEach(list-> System.out.println("list = " + list));
        for (Dorm dorm : dormList) {
            System.out.println("dorm = " + dorm);
        }

    }

    @Test
    void getDormByName() {
        List<Dorm> dormList = dormMapper.getDormByName("5-706");
        dormList.stream().forEach(list->System.out.println("list = " + list));
    }

    @Test
    @Transactional
    void saveDorm() {
    }

    @Test
    @Transactional
    void editDorm() {
    }

    @Test
    @Transactional
    void deleteDorms() {
    }
}