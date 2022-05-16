package com.baiyun.mapper;

import com.baiyun.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Repository
public interface RoleMapper {

    List<Role> getAllRoles();

    int insert(Role role);

    int deleteByPrimaryKey(Integer rid);
}