package com.kaiyu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Data
public class MenuRole implements Serializable {
    private Integer id;

    private Integer mid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}