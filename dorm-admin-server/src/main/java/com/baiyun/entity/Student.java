package com.baiyun.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Data
public class Student implements Serializable {

    private Integer id;
    private String studentNo;
    private String studentName;
    private Integer sex;
    private Integer dormId;
    private Dorm dorm;

    private static final long serialVersionUID = 1L;
}
