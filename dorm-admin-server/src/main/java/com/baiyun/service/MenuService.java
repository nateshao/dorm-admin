package com.baiyun.service;

import com.baiyun.mapper.MenuMapper;
import com.baiyun.mapper.MenuRoleMapper;
import com.baiyun.entity.Menu;
import com.baiyun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Service
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {

    @Autowired
    private MenuMapper menuDao;

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuDao.getAllMenusWithRole();
    }

    public List<Menu> getMenusByUserId() {
        return menuDao.getMenusByUserId(((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
