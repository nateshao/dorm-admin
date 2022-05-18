package com.baiyun.mapper;

import com.baiyun.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
@SpringBootTest
class RoleMapperTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    void getAllRoles() {
        List<Role> roleList = roleMapper.getAllRoles();
        roleList.stream().forEach(list-> System.out.println("list = " + list));
    }

    @Test
    @Transactional
    void insert() {
    }

    @Test
    @Transactional
    void deleteByPrimaryKey() {
    }
}