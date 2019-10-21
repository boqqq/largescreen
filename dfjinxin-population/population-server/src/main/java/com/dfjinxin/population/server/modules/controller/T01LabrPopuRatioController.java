package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01LabrPopuRatio;
import com.dfjinxin.population.server.modules.service.T01LabrPopuRatioService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01LabrPopuRatioController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 劳动人口占比及同比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:23:18
 */
@RestController
public class T01LabrPopuRatioController implements IT01LabrPopuRatioController{

    @Autowired
    private T01LabrPopuRatioService t01LabrPopuRatioService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01LabrPopuRatio> T01LabrPopuRatioList = t01LabrPopuRatioService.getList(params);

        return Response.ok().put("list", T01LabrPopuRatioList);
    }


    /**
     * 信息
     */
    @Override
    public Response info(@PathVariable("areaCode") String areaCode){
		T01LabrPopuRatio t01LabrPopuRatio = t01LabrPopuRatioService.getById(areaCode);

        return Response.ok().put("t01LabrPopuRatio", t01LabrPopuRatio);
    }

    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01LabrPopuRatio t01LabrPopuRatio){
		t01LabrPopuRatioService.save(t01LabrPopuRatio);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01LabrPopuRatio t01LabrPopuRatio){
		t01LabrPopuRatioService.updateById(t01LabrPopuRatio);

        return Response.ok();
    }

    /**
     * 删除
     */
    @Override
    public Response delete(@RequestBody String[] areaCodes){
		t01LabrPopuRatioService.removeByIds(Arrays.asList(areaCodes));

        return Response.ok();
    }

}
