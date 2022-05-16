package com.kaiyu.dao;

import com.kaiyu.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Repository
public interface RoleDao {

    List<Role> getAllRoles();

    int insert(Role role);

    int deleteByPrimaryKey(Integer rid);
}