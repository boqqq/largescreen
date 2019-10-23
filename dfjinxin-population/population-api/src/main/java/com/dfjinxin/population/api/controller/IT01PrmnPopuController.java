package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T01PrmnPopu;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 常住人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:47
 */
@FeignClient(contextId = "home_t01prmnpopu",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t01prmnpopu")
public interface IT01PrmnPopuController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 各市县常住人口情况
     */
    @RequestMapping("/select")
    Response select();


    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T01PrmnPopu t01PrmnPopu);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T01PrmnPopu t01PrmnPopu);


}
