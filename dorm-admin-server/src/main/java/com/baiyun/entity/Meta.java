package com.baiyun.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
@Data
public class Meta implements Serializable {

    private Boolean keepAlive;

    private Boolean requireAuth;

    private static final long serialVersionUID = 1L;
}
