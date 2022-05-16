package com.kaiyu.dao;

import com.kaiyu.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Repository
public interface MenuDao {

    List<Menu> getAllMenusWithRole();

    List<Menu> getMenusByUserId(Integer userId);
}