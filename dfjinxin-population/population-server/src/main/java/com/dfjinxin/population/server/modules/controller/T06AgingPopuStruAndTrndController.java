package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT06AgingPopuStruAndTrndController;
import com.dfjinxin.population.api.entity.T06AgingPopuStruAndTrnd;
import com.dfjinxin.population.server.modules.service.T06AgingPopuStruAndTrndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 老龄人口结构与趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@RestController
public class T06AgingPopuStruAndTrndController implements IT06AgingPopuStruAndTrndController {

    @Autowired
    private T06AgingPopuStruAndTrndService t06AgingPopuStruAndTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t06AgingPopuStruAndTrndService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 列表
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
        List<T06AgingPopuStruAndTrnd> page = t06AgingPopuStruAndTrndService.select(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T06AgingPopuStruAndTrnd t06AgingPopuStruAndTrnd){
		t06AgingPopuStruAndTrndService.save(t06AgingPopuStruAndTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T06AgingPopuStruAndTrnd t06AgingPopuStruAndTrnd){
		t06AgingPopuStruAndTrndService.updateById(t06AgingPopuStruAndTrnd);

        return Response.ok();
    }


}
