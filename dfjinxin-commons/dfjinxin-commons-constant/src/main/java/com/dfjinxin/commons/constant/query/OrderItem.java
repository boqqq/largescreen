package com.dfjinxin.commons.constant.query;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItem implements Serializable {
private String field;
    private OrderEnum order;
}
