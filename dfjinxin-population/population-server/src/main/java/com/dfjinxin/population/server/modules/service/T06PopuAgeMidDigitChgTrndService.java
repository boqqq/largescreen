package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T06PopuAgeMidDigitChgTrnd;
import java.util.Map;

/**
 * 人口年龄中位数变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:13:11
 */
public interface T06PopuAgeMidDigitChgTrndService extends IService<T06PopuAgeMidDigitChgTrnd> {

    PageUtils queryPage(Map<String, Object> params);
}

