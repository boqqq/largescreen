package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T02ZonePrmnFognPopuIncChg;

import java.util.List;
import java.util.Map;

/**
 * 各地区户籍人口增量变化
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
public interface T02ZonePrmnFognPopuIncChgService extends IService<T02ZonePrmnFognPopuIncChg> {

    PageUtils queryPage(Map<String, Object> params);

    List<T02ZonePrmnFognPopuIncChg> getList(Map<String, Object> params);
}

