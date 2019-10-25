package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT06BringChgFeatController;
import com.dfjinxin.population.api.entity.T06BringChgFeat;
import com.dfjinxin.population.server.modules.service.T06BringChgFeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 老年抚养比变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:47:52
 */
@RestController
public class T06BringChgFeatController implements IT06BringChgFeatController {

    @Autowired
    private T06BringChgFeatService t06BringChgFeatService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t06BringChgFeatService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 老年抚养比变化特征
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
        List<Map<String, Object>> page = t06BringChgFeatService.select();

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T06BringChgFeat t06BringChgFeat){
		t06BringChgFeatService.save(t06BringChgFeat);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T06BringChgFeat t06BringChgFeat){
		t06BringChgFeatService.updateById(t06BringChgFeat);

        return Response.ok();
    }


}
