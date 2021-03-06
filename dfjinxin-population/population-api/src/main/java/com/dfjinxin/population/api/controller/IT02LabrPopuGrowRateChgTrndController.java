package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T02LabrPopuGrowRateChgTrnd;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 劳动力人口增长率变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@FeignClient(contextId = "home_t02labrpopugrowratechgtrnd",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t02labrpopugrowratechgtrnd")
public interface IT02LabrPopuGrowRateChgTrndController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T02LabrPopuGrowRateChgTrnd t02LabrPopuGrowRateChgTrnd);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T02LabrPopuGrowRateChgTrnd t02LabrPopuGrowRateChgTrnd);


}
