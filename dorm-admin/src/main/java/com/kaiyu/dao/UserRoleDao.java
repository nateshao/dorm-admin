package com.kaiyu.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Repository
public interface UserRoleDao {

    void deleteByUserId(Integer uid);

    Integer addRole(@Param("uid") Integer userId, @Param("rids") Integer[] rids);
}