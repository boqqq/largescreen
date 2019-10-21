package com.dfjinxin.commons.constant.query;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回值
 */
@Data
public class PaginationResult<T> implements Serializable {
    /** 总记录数 */
    private Integer total;
    /** 偏移 */
    private Integer offset;
    /** 每页记录数 */
    private Integer limit;
    /** 结果集 */
    private List<T> data;

    public PaginationResult() {
    }

    public PaginationResult(Integer total, Integer offset, Integer limit, List<T> data) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
        this.data = data;
    }
}
