package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT06PopuBirthRateAndDeadRateTrndController;
import com.dfjinxin.population.api.entity.T06PopuBirthRateAndDeadRateTrnd;
import com.dfjinxin.population.server.modules.service.T06PopuBirthRateAndDeadRateTrndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:33:14
 */
@RestController
public class T06PopuBirthRateAndDeadRateTrndController implements IT06PopuBirthRateAndDeadRateTrndController {

    @Autowired
    private T06PopuBirthRateAndDeadRateTrndService t06PopuBirthRateAndDeadRateTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t06PopuBirthRateAndDeadRateTrndService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 人口出生率与死亡率趋势
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
        List<T06PopuBirthRateAndDeadRateTrnd> page = t06PopuBirthRateAndDeadRateTrndService.select(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T06PopuBirthRateAndDeadRateTrnd t06PopuBirthRateAndDeadRateTrnd){
		t06PopuBirthRateAndDeadRateTrndService.save(t06PopuBirthRateAndDeadRateTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T06PopuBirthRateAndDeadRateTrnd t06PopuBirthRateAndDeadRateTrnd){
		t06PopuBirthRateAndDeadRateTrndService.updateById(t06PopuBirthRateAndDeadRateTrnd);

        return Response.ok();
    }


}
