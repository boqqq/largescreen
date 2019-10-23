package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01AgingPopuPct;

import java.util.List;
import java.util.Map;

/**
 * 老龄人口占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:24
 */
public interface T01AgingPopuPctService extends IService<T01AgingPopuPct> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01AgingPopuPct> getList(Map<String, Object> params);

}

