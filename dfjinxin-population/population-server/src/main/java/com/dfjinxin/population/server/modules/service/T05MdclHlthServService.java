package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T05MdclHlthServ;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:16:05
 */
public interface T05MdclHlthServService extends IService<T05MdclHlthServ> {

    PageUtils queryPage(Map<String, Object> params);

    List<T05MdclHlthServ> getList(Map<String, Object> params);

}

