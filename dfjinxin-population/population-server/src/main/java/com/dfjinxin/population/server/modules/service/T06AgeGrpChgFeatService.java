package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T06AgeGrpChgFeat;

import java.util.List;
import java.util.Map;

/**
 * 年龄组迁徙变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
public interface T06AgeGrpChgFeatService extends IService<T06AgeGrpChgFeat> {

    PageUtils queryPage(Map<String, Object> params);

    List<T06AgeGrpChgFeat> select(Map<String, Object> params);
}

