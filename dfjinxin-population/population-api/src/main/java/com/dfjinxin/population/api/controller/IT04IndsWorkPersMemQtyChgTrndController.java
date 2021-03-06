package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:53:58
 */
@FeignClient(contextId = "home_t04indsworkpersmemqtychgtrnd",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("home/t04indsworkpersmemqtychgtrnd")
public interface IT04IndsWorkPersMemQtyChgTrndController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);



    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T04IndsWorkPersMemQtyChgTrnd t04IndsWorkPersMemQtyChgTrnd);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T04IndsWorkPersMemQtyChgTrnd t04IndsWorkPersMemQtyChgTrnd);


}
