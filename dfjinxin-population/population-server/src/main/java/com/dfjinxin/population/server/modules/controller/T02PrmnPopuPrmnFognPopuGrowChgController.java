package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T02PrmnPopuPrmnFognPopuGrowChg;
import com.dfjinxin.population.server.modules.service.T02PrmnPopuPrmnFognPopuGrowChgService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT02PrmnPopuPrmnFognPopuGrowChgController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 常住人口与常住外来人口增长率变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@RestController
public class T02PrmnPopuPrmnFognPopuGrowChgController implements IT02PrmnPopuPrmnFognPopuGrowChgController{

    @Autowired
    private T02PrmnPopuPrmnFognPopuGrowChgService t02PrmnPopuPrmnFognPopuGrowChgService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T02PrmnPopuPrmnFognPopuGrowChg> list = t02PrmnPopuPrmnFognPopuGrowChgService.getList(params);
        return Response.ok().put("list", list);

    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T02PrmnPopuPrmnFognPopuGrowChg t02PrmnPopuPrmnFognPopuGrowChg){
		t02PrmnPopuPrmnFognPopuGrowChgService.save(t02PrmnPopuPrmnFognPopuGrowChg);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T02PrmnPopuPrmnFognPopuGrowChg t02PrmnPopuPrmnFognPopuGrowChg){
		t02PrmnPopuPrmnFognPopuGrowChgService.updateById(t02PrmnPopuPrmnFognPopuGrowChg);

        return Response.ok();
    }


}
