package com.baiyun.mapper;

import com.baiyun.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Repository
public interface MenuMapper {

    List<Menu> getAllMenusWithRole();

    List<Menu> getMenusByUserId(Integer userId);
}