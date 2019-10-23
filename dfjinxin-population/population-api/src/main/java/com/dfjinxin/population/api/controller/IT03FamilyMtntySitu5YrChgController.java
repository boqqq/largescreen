package com.dfjinxin.population.api.controller;

import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.FeignClientConfig;
import com.dfjinxin.population.api.entity.T03FamilyMtntySitu5YrChg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:39:27
 */
@FeignClient(contextId = "home_t03familymtntysitu5yrchg",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t03familymtntysitu5yrchg")
public interface IT03FamilyMtntySitu5YrChgController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);

    @RequestMapping("/findAll")
    Response findALL();


    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T03FamilyMtntySitu5YrChg t03FamilyMtntySitu5YrChg);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T03FamilyMtntySitu5YrChg t03FamilyMtntySitu5YrChg);


}
