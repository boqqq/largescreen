package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T02PrmnPopuPrmnFognPopuGrowChg;

import java.util.List;
import java.util.Map;

/**
 * 常住人口与常住外来人口增长率变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
public interface T02PrmnPopuPrmnFognPopuGrowChgService extends IService<T02PrmnPopuPrmnFognPopuGrowChg> {

    PageUtils queryPage(Map<String, Object> params);

    List<T02PrmnPopuPrmnFognPopuGrowChg> getList(Map<String, Object> params);
}

