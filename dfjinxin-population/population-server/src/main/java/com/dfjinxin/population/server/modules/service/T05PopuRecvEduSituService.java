package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T05PopuRecvEduSitu;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:38
 */
public interface T05PopuRecvEduSituService extends IService<T05PopuRecvEduSitu> {

    PageUtils queryPage(Map<String, Object> params);

    List<T05PopuRecvEduSitu> getList(Map<String, Object> params);

}

