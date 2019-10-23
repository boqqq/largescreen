package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T03PopuFlowInFlowOutStru;
import java.util.Map;

/**
 * 人口流入流出结构
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
public interface T03PopuFlowInFlowOutStruService extends IService<T03PopuFlowInFlowOutStru> {

    PageUtils queryPage(Map<String, Object> params);
}

