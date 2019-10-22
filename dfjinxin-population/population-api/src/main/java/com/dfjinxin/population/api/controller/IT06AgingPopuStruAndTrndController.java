package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T06AgingPopuStruAndTrnd;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 老龄人口结构与趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@FeignClient(contextId = "home_t06agingpopustruandtrnd",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t06agingpopustruandtrnd")
public interface IT06AgingPopuStruAndTrndController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 老龄人口结构与趋势
     */
    @RequestMapping("/select")
    Response select(@RequestParam Map<String, Object> params);

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T06AgingPopuStruAndTrnd t06AgingPopuStruAndTrnd);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T06AgingPopuStruAndTrnd t06AgingPopuStruAndTrnd);


}
