package com.kaiyu.entity;

import lombok.Data;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Data
public class Building {

    private Integer id;
    private String name;
    private Integer buildingType;
    private String remark;

    private static final long serialVersionUID = 1L;
}
