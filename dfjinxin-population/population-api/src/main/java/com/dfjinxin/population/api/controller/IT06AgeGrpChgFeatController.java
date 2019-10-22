package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T06AgeGrpChgFeat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 年龄组迁徙变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@FeignClient(contextId = "home_t06agegrpchgfeat",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t06agegrpchgfeat")
public interface IT06AgeGrpChgFeatController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 年龄随迁徙变化特征
     */
    @RequestMapping("/select")
    Response select(@RequestParam Map<String, Object> params);


    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T06AgeGrpChgFeat t06AgeGrpChgFeat);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T06AgeGrpChgFeat t06AgeGrpChgFeat);


}
