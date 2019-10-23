package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T04RgstRgstTypWorkPersMemStruChg;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:52:34
 */
public interface T04RgstRgstTypWorkPersMemStruChgService extends IService<T04RgstRgstTypWorkPersMemStruChg> {

    PageUtils queryPage(Map<String, Object> params);

    List<T04RgstRgstTypWorkPersMemStruChg> getList(Map<String, Object> params);

}

