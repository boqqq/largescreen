package com.dfjinxin.population.server.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.population.api.entity.T01PrmnPopuAgeMidDigit;

import java.util.List;
import java.util.Map;

/**
 * 常住人口年龄中位数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:18
 */
public interface T01PrmnPopuAgeMidDigitService extends IService<T01PrmnPopuAgeMidDigit> {

    PageUtils queryPage(Map<String, Object> params);

    List<T01PrmnPopuAgeMidDigit> getList(Map<String, Object> params);

}

