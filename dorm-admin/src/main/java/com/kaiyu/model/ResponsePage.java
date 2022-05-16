package com.kaiyu.model;

import lombok.Data;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Data
public class ResponsePage {

    private List<?> data;
    private Long total;
}
