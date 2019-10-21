package com.dfjinxin.population.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dfjinxin.population.api.entity.T06PopuAgeMidDigitChgTrnd;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import com.dfjinxin.commons.core.util.api.Response;
import org.springframework.cloud.openfeign.FeignClient;
import com.dfjinxin.population.api.FeignClientConfig;

/**
 * 人口年龄中位数变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:13:11
 */
@FeignClient(contextId = "dev_t06popuagemiddigitchgtrnd",
        name = FeignClientConfig.NAME, configuration = FeignClientsConfiguration.class)
@RequestMapping("dev/t06popuagemiddigitchgtrnd")
public interface IT06PopuAgeMidDigitChgTrndController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    Response list(@RequestParam Map<String, Object> params);


    /**
     * 信息
     */
    @RequestMapping("/info/{dateStat}")
    public Response info(@PathVariable("dateStat") String dateStat);

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Response save(@RequestBody T06PopuAgeMidDigitChgTrnd t06PopuAgeMidDigitChgTrnd);

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Response update(@RequestBody T06PopuAgeMidDigitChgTrnd t06PopuAgeMidDigitChgTrnd);

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Response delete(@RequestBody String[] dateStats);

}
