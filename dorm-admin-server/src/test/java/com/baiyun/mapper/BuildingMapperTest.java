package com.baiyun.mapper;

import com.baiyun.entity.Building;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @date Created by 邵桐杰 on 2022/5/17 11:23
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
@SpringBootTest
class BuildingMapperTest {
    @Autowired
    private BuildingMapper buildingMapper;

    @Test
    void getBuildingByName() {
        List<Building> buildingList = buildingMapper.getBuildingByName("清枫阁");
        buildingList.stream().forEach(list-> System.out.println("list = " + list));
    }

    @Test
    @Transactional
    void saveBuilding() {
    }

    @Test
    @Transactional
    void editBuilding() {
    }

    @Test
    @Transactional
    void deleteBuildings() {
    }

    @Test
    void getBuildingAll() {
        List<Building> list = buildingMapper.getBuildingAll();
        list.stream().forEach(lists-> System.out.println("lists = " + lists));
    }
}