package com.dfjinxin.commons.constant.query;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageDTO implements Serializable {

    private static final long serialVersionUID = 7567068064496983266L;
    /** 分页条数 */
    private Integer limit;

    /** 起始页 */
    private Integer offset;

}
