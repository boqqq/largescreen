package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T06PopuBirthRateAndDeadRateTrnd;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:33:14
 */
@FeignClient(contextId = "home_t06popubirthrateanddeadratetrnd",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t06popubirthrateanddeadratetrnd")
public interface IT06PopuBirthRateAndDeadRateTrndController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 人口出生率与死亡率趋势
     */
    @RequestMapping("/select")
    Response select(@RequestParam Map<String, Object> params);


    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T06PopuBirthRateAndDeadRateTrnd t06PopuBirthRateAndDeadRateTrnd);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T06PopuBirthRateAndDeadRateTrnd t06PopuBirthRateAndDeadRateTrnd);


}
