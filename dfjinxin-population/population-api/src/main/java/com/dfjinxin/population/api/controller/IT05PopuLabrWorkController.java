package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T05PopuLabrWork;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:16:11
 */
@FeignClient(contextId = "home_t05populabrwork",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t05populabrwork")
public interface IT05PopuLabrWorkController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T05PopuLabrWork t05PopuLabrWork);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T05PopuLabrWork t05PopuLabrWork);


}
