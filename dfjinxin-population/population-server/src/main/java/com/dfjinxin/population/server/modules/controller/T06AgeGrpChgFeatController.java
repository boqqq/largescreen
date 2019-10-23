package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT06AgeGrpChgFeatController;
import com.dfjinxin.population.api.entity.T06AgeGrpChgFeat;
import com.dfjinxin.population.server.modules.service.T06AgeGrpChgFeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 年龄组迁徙变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@RestController
public class T06AgeGrpChgFeatController implements IT06AgeGrpChgFeatController {

    @Autowired
    private T06AgeGrpChgFeatService t06AgeGrpChgFeatService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t06AgeGrpChgFeatService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 年龄随迁徙变化特征
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
        List<T06AgeGrpChgFeat> page = t06AgeGrpChgFeatService.select(params);

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T06AgeGrpChgFeat t06AgeGrpChgFeat){
		t06AgeGrpChgFeatService.save(t06AgeGrpChgFeat);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T06AgeGrpChgFeat t06AgeGrpChgFeat){
		t06AgeGrpChgFeatService.updateById(t06AgeGrpChgFeat);

        return Response.ok();
    }


}
