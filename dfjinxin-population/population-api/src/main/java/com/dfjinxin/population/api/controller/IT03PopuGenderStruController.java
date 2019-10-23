package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T03PopuGenderStru;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 人口性别结构
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@FeignClient(contextId = "home_t03popugenderstru",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t03popugenderstru")
public interface IT03PopuGenderStruController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T03PopuGenderStru t03PopuGenderStru);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T03PopuGenderStru t03PopuGenderStru);

    @RequestMapping("/findAll")
    Response findAll();
}
