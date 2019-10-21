package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01LabrPopuRatio;

import java.util.List;
import java.util.Map;

/**
 * 劳动人口占比及同比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:23:18
 */
public interface T01LabrPopuRatioService extends IService<T01LabrPopuRatio> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01LabrPopuRatio> getList(Map<String, Object> params);
}

