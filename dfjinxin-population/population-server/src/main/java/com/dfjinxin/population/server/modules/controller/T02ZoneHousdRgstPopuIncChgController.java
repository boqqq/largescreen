package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T02ZoneHousdRgstPopuIncChg;
import com.dfjinxin.population.server.modules.service.T02ZoneHousdRgstPopuIncChgService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT02ZoneHousdRgstPopuIncChgController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 各地区户籍人口增量变化
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@RestController
public class T02ZoneHousdRgstPopuIncChgController implements IT02ZoneHousdRgstPopuIncChgController{

    @Autowired
    private T02ZoneHousdRgstPopuIncChgService t02ZoneHousdRgstPopuIncChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T02ZoneHousdRgstPopuIncChg> list = t02ZoneHousdRgstPopuIncChgService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T02ZoneHousdRgstPopuIncChg t02ZoneHousdRgstPopuIncChg){
		t02ZoneHousdRgstPopuIncChgService.save(t02ZoneHousdRgstPopuIncChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T02ZoneHousdRgstPopuIncChg t02ZoneHousdRgstPopuIncChg){
		t02ZoneHousdRgstPopuIncChgService.updateById(t02ZoneHousdRgstPopuIncChg);

        return Response.ok();
    }


}
