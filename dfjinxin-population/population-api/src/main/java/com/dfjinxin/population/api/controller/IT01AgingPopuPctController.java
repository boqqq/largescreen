package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T01AgingPopuPct;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 老龄人口占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:24
 */
@FeignClient(contextId = "home_t01agingpopupct",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t01agingpopupct")
public interface IT01AgingPopuPctController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T01AgingPopuPct t01AgingPopuPct);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T01AgingPopuPct t01AgingPopuPct);


}
