package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T03ZoneFlowOutCibutePct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 各地区流出贡献占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@FeignClient(contextId = "home_t03zoneflowoutcibutepct",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t03zoneflowoutcibutepct")
public interface IT03ZoneFlowOutCibutePctController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T03ZoneFlowOutCibutePct t03ZoneFlowOutCibutePct);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T03ZoneFlowOutCibutePct t03ZoneFlowOutCibutePct);

    @RequestMapping("/findAll")
    Response findAll();
}
