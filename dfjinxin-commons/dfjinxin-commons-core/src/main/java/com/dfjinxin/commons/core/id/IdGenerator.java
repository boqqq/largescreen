package com.dfjinxin.commons.core.id;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 主键生成器
 */
public interface IdGenerator {
    int BATCH_MAX_COUNT = 1000;

    /**
     * 获得主键
     *
     * @return 64 bit 长整型主键，>0
     */
    Long getId();

    /**
     * 批量获得主键
     *
     * @param count 数量，最大支持一批1000个
     * @return 主键列表
     */
    List<Long> getIds(@PathVariable("count") int count);
}
