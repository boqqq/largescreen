package com.dfjinxin.development.api.controller;

import java.util.Map;

import com.dfjinxin.development.api.FeignClientConfig;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.development.api.entity.Test;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-20 01:08:46
 */
@FeignClient(contextId = "dev_test",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("dev/test")
public interface ITestController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Response info(@PathVariable("id") Long id);

    @RequestMapping("/test/{name}")
    Response infoLambda(@PathVariable("name") String name);

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody Test test);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody Test test);

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Response delete(@RequestBody Long[] ids);

}
