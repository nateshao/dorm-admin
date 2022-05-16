package com.baiyun.mapper;

import com.baiyun.entity.Role;
import com.baiyun.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Repository
public interface UserMapper {

    int saveUser(String username, String password);

    User findByUsername(String username);

    List<Role> getUserRolesById(Integer userId);

    User findUserById(Integer userId);

    Integer updatePassword(@Param("userId") Integer userId, @Param("password") String password);

    int updateUser(User user);

    List<User> getUserByName(@Param("userId") Integer id, @Param("name") String name);

    int deleteUser(Integer userId);
}