package com.baiyun.service;

import com.baiyun.mapper.RoleMapper;
import com.baiyun.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/16
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleDao;

    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    public int addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleDao.insert(role);
    }

    public int deleteRoleById(Integer rid) {
        return roleDao.deleteByPrimaryKey(rid);
    }
}
