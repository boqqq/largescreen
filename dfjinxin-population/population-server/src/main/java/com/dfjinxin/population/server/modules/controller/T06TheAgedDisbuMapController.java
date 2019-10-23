package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT06TheAgedDisbuMapController;
import com.dfjinxin.population.api.entity.T06TheAgedDisbuMap;
import com.dfjinxin.population.server.modules.service.T06TheAgedDisbuMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 老年人分布地图
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 19:02:19
 */
@RestController
public class T06TheAgedDisbuMapController implements IT06TheAgedDisbuMapController {

    @Autowired
    private T06TheAgedDisbuMapService t06TheAgedDisbuMapService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t06TheAgedDisbuMapService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 老年人分布地图
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
        List<T06TheAgedDisbuMap> page = t06TheAgedDisbuMapService.select();

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T06TheAgedDisbuMap t06TheAgedDisbuMap){
		t06TheAgedDisbuMapService.save(t06TheAgedDisbuMap);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T06TheAgedDisbuMap t06TheAgedDisbuMap){
		t06TheAgedDisbuMapService.updateById(t06TheAgedDisbuMap);

        return Response.ok();
    }


}
