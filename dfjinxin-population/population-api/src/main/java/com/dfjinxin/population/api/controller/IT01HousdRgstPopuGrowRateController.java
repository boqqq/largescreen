package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T01HousdRgstPopuGrowRate;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 户籍人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:39
 */
@FeignClient(contextId = "home_t01housdrgstpopugrowrate",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t01housdrgstpopugrowrate")
public interface IT01HousdRgstPopuGrowRateController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T01HousdRgstPopuGrowRate t01HousdRgstPopuGrowRate);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T01HousdRgstPopuGrowRate t01HousdRgstPopuGrowRate);


}
