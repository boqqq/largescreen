package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T03PrmnPopuAgeStru5YrChg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 常住人口年龄结构5年变迁
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@FeignClient(contextId = "home_t03prmnpopuagestru5yrchg",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t03prmnpopuagestru5yrchg")
public interface IT03PrmnPopuAgeStru5YrChgController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T03PrmnPopuAgeStru5YrChg t03PrmnPopuAgeStru5YrChg);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T03PrmnPopuAgeStru5YrChg t03PrmnPopuAgeStru5YrChg);

    @RequestMapping("/findAll")
    Response findAll();

}
