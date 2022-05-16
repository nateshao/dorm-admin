package com.baiyun.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Data
public class Role implements Serializable {
    private Integer id;

    private String name;

    /**
     * 角色名称
     */
    private String nameZh;

    private static final long serialVersionUID = 1L;
}