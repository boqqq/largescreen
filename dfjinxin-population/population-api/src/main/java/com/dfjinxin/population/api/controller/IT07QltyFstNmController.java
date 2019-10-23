package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T07QltyFstNm;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:05:50
 */
@FeignClient(contextId = "home_t07qltyfstnm",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t07qltyfstnm")
public interface IT07QltyFstNmController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    /**
     * 空气质量排名
     */
    @RequestMapping("/select")
    Response select(@RequestParam Map<String, Object> params);

    /**
     * 城乡发展差异
     */
    @RequestMapping("/bottomIndex1")
    Response bottomIndex1(@RequestParam Map<String, Object> params);

    /**
     * 人与资源环境
     */
    @RequestMapping("/bottomIndex2")
    Response bottomIndex2(@RequestParam Map<String, Object> params);

    /**
     * 人与社会保障
     */
    @RequestMapping("/bottomIndex3")
    Response bottomIndex3(@RequestParam Map<String, Object> params);

    /**
     * 左边指标
     */
    @RequestMapping("/leftIndex")
    Response leftIndex(@RequestParam Map<String, Object> params);

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T07QltyFstNm t07QltyFstNm);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T07QltyFstNm t07QltyFstNm);


}
