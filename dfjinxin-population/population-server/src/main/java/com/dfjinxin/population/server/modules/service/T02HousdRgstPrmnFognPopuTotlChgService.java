package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T02HousdRgstPrmnFognPopuTotlChg;

import java.util.List;
import java.util.Map;

/**
 * 流动人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
public interface T02HousdRgstPrmnFognPopuTotlChgService extends IService<T02HousdRgstPrmnFognPopuTotlChg> {

    PageUtils queryPage(Map<String, Object> params);

    List<T02HousdRgstPrmnFognPopuTotlChg> getList(Map<String, Object> params);
}

