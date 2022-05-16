package com.baiyun.mapper;

import com.baiyun.entity.Building;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Repository
public interface BuildingMapper {

    List<Building> getBuildingByName(String buildingName);

    int saveBuilding(Building building);

    int editBuilding(Building building);

    int deleteBuildings(@Param("ids") List<Integer> ids);

    List<Building> getBuildingAll();
}
