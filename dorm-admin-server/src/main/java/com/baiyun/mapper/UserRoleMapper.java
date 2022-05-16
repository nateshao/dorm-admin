package com.baiyun.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Repository
public interface UserRoleMapper {

    void deleteByUserId(Integer uid);

    Integer addRole(@Param("uid") Integer userId, @Param("rids") Integer[] rids);
}