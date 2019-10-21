package com.dfjinxin.commons.mybatis;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dfjinxin.commons.constant.query.PaginationQueryInput;
import com.dfjinxin.commons.constant.query.PaginationResult;
import org.springframework.util.Assert;

public abstract class PageUtils {
    private static Integer defaultPageSize = 10;
    private static Integer defaultPageNum = 1;

    public static <T> void convertPage(IPage<T> page, PaginationQueryInput input) {
        Assert.notNull(page, "IPage对象不能为NULL");

        if (input == null) {
            page.setCurrent(1);
            page.setSize(defaultPageSize);
        } else {
            page.setSize(input.getLimit() != null && input.getLimit() >= 0 ? input.getLimit() : defaultPageSize);
            page.setCurrent(input.getOffset() != null && input.getOffset() >= 0 && page.getSize() > 0 ? (input.getOffset() + page.getSize()) / page.getSize() : defaultPageNum);
        }
    }

    public static <T> PaginationResult<T> convertPageResult(IPage<T> page) {
        Assert.notNull(page, "IPage对象不能为NULL");
        return new PaginationResult<T>((int) page.getTotal(), (int) ((page.getCurrent() - 1) * page.getSize()), (int) page.getSize(), page.getRecords());
    }



}