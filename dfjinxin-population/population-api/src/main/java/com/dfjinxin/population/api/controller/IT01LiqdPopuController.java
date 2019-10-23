package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T01LiqdPopu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 流动人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:04
 */
@FeignClient(contextId = "home_t01liqdpopu",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t01liqdpopu")
public interface IT01LiqdPopuController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 左侧指标
     */
    @RequestMapping("/leftIndex")
    Response leftIndex(@RequestParam Map<String, Object> params);


    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T01LiqdPopu t01LiqdPopu);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T01LiqdPopu t01LiqdPopu);


}
