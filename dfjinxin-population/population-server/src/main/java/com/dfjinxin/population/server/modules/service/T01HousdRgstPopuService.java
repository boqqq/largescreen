package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01HousdRgstPopu;

import java.util.List;
import java.util.Map;

/**
 * 户籍人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:55
 */
public interface T01HousdRgstPopuService extends IService<T01HousdRgstPopu> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01HousdRgstPopu> getList(Map<String, Object> params);

}

