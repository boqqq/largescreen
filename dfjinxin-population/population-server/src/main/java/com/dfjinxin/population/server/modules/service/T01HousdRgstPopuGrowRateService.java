package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import com.dfjinxin.population.api.entity.T01LiqdPopuAndGrowRate;

import java.util.List;
import java.util.Map;

/**
 * 户籍人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:39
 */
public interface T01HousdRgstPopuGrowRateService extends IService<T01HousdRgstPopuGrowRate> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01HousdRgstPopuGrowRate> getList(Map<String, Object> params);

    List<T01HousdRgstPopuGrowRate> select();

}

