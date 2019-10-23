package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T02ZonePrmnFognPopuIncChg;
import com.dfjinxin.population.server.modules.service.T02ZonePrmnFognPopuIncChgService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT02ZonePrmnFognPopuIncChgController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 各地区户籍人口增量变化
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@RestController
public class T02ZonePrmnFognPopuIncChgController implements IT02ZonePrmnFognPopuIncChgController{

    @Autowired
    private T02ZonePrmnFognPopuIncChgService t02ZonePrmnFognPopuIncChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T02ZonePrmnFognPopuIncChg> list = t02ZonePrmnFognPopuIncChgService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T02ZonePrmnFognPopuIncChg t02ZonePrmnFognPopuIncChg){
		t02ZonePrmnFognPopuIncChgService.save(t02ZonePrmnFognPopuIncChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T02ZonePrmnFognPopuIncChg t02ZonePrmnFognPopuIncChg){
		t02ZonePrmnFognPopuIncChgService.updateById(t02ZonePrmnFognPopuIncChg);

        return Response.ok();
    }


}
