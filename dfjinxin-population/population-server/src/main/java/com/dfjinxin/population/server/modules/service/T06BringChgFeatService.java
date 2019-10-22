package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T06BringChgFeat;

import java.util.List;
import java.util.Map;

/**
 * 老年抚养比变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:47:52
 */
public interface T06BringChgFeatService extends IService<T06BringChgFeat> {

    PageUtils queryPage(Map<String, Object> params);

    List<T06BringChgFeat> select();
}

