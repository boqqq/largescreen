package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 老年人分布地图
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 19:02:19
 */
@FeignClient(contextId = "home_t06theageddisbumap",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t06theageddisbumap")
public interface IT06TheAgedDisbuMapController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 老年人分布地图
     */
    @RequestMapping("/select")
    Response select(@RequestParam Map<String, Object> params);

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T06TheAgedDisbuMap t06TheAgedDisbuMap);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T06TheAgedDisbuMap t06TheAgedDisbuMap);


}
