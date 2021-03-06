package com.baiyun.controller;

import com.baiyun.entity.Building;
import com.baiyun.model.ResponseMsg;
import com.baiyun.model.ResponsePage;
import com.baiyun.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/16
 */
@RestController
@RequestMapping("/api/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/all")
    public List<Building> getBuildingAll() {
        return buildingService.getBuildingAll();
    }

    @GetMapping("/list")
    public ResponsePage getBuildingPage(Integer page, Integer size, String name) {
        return buildingService.getBuildingPage(page, size, name);
    }

    @PostMapping("/add")
    public ResponseMsg saveOrEditBuilding(@RequestBody Building building) {
        if (null == building.getId()) {
            if (buildingService.saveBuilding(building) >= 1) {
                return ResponseMsg.ok("添加成功！");
            } else {
                return ResponseMsg.error("添加失败！");
            }
        } else {
            if (buildingService.editBuilding(building) >= 1) {
                return ResponseMsg.ok("修改成功！");
            } else {
                return ResponseMsg.error("修改失败！");
            }
        }
    }

    @PostMapping("/del")
    public ResponseMsg deleteBuildings(@RequestBody List<Building> buildings) {
        if (buildingService.deleteBuildings(buildings) >= 1) {
            return ResponseMsg.ok("删除成功！");
        } else {
            return ResponseMsg.error("删除失败！");
        }
    }
}
