package com.dfjinxin.commons.constant.query;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public abstract class PaginationQueryInput implements Serializable {

    /** 偏移记录数，不是页号 */
    private Integer offset;
    /** 每页记录数 默认十条*/
    private Integer limit ;
    /** 排序字段列表 */
    private List<OrderItem> orderBy;

}
