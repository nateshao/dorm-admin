package com.baiyun.mapper;

import com.baiyun.entity.Role;
import com.baiyun.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @date Created by 邵桐杰 on 2022/5/17 11:25
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Transactional
    void saveUser() {
    }

    /**
     * TODO
     */
    @Test
    void findByUsername() {
//        User user = userMapper.findByUsername("管理员");
//        System.out.println("user = " + user);
    }

    @Test
    void getUserRolesById() {
        List<Role> roleList = userMapper.getUserRolesById(14);
        roleList.stream().forEach(list-> System.out.println("list = " + list));
    }

    /**
     * TODO
     */
    @Test
    void findUserById() {
        User userById = userMapper.findUserById(13);
        System.out.println("userById = " + userById);
    }

    @Test
    @Transactional
    void updatePassword() {
    }

    @Test
    @Transactional
    void updateUser() {
    }

    /**
     * TODO
     */
    @Test
    void getUserByName() {
    }

    @Test
    @Transactional
    void deleteUser() {
    }
}