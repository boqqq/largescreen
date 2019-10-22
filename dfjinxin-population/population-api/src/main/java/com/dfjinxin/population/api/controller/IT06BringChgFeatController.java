package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T06BringChgFeat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 老年抚养比变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:47:52
 */
@FeignClient(contextId = "home_t06bringchgfeat",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t06bringchgfeat")
public interface IT06BringChgFeatController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 老年抚养比变化特征
     */
    @RequestMapping("/select")
    Response select(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T06BringChgFeat t06BringChgFeat);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T06BringChgFeat t06BringChgFeat);


}
