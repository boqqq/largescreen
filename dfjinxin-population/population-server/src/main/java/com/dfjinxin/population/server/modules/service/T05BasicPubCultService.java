package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T05BasicPubCult;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:15:45
 */
public interface T05BasicPubCultService extends IService<T05BasicPubCult> {

    PageUtils queryPage(Map<String, Object> params);

    List<T05BasicPubCult> getList(Map<String, Object> params);

}

