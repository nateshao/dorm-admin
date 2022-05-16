package com.baiyun.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Data
public class Dorm implements Serializable {

    private Integer id;
    private String name;
    private Integer buildingId;
    private Integer maxNum;
    private String remark;
    private Building building;

    private static final long serialVersionUID = 1L;
}
