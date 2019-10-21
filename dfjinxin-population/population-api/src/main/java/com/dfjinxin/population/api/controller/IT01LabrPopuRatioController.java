package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T01LabrPopuRatio;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 劳动人口占比及同比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:23:18
 */
@FeignClient(contextId = "home_t01labrpopuratio",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t01labrpopuratio")
public interface IT01LabrPopuRatioController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);


    /**
     * 信息
     */
    @RequestMapping("/info/{areaCode}")
    public Response info(@PathVariable("areaCode") String areaCode);

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T01LabrPopuRatio t01LabrPopuRatio);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T01LabrPopuRatio t01LabrPopuRatio);

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Response delete(@RequestBody String[] areaCodes);

}
