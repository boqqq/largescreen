package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T02LabrPopuGrowRateChgTrnd;

import java.util.List;
import java.util.Map;

/**
 * 劳动力人口增长率变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
public interface T02LabrPopuGrowRateChgTrndService extends IService<T02LabrPopuGrowRateChgTrnd> {

    PageUtils queryPage(Map<String, Object> params);

    List<T02LabrPopuGrowRateChgTrnd> getList(Map<String, Object> params);
}

