package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T07QltyFstNm;
import com.dfjinxin.population.server.modules.service.T07QltyFstNmService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT07QltyFstNmController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 10:05:50
 */
@RestController
public class T07QltyFstNmController implements IT07QltyFstNmController{

    @Autowired
    private T07QltyFstNmService t07QltyFstNmService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t07QltyFstNmService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 空气质量排名
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
       List<T07QltyFstNm> page = t07QltyFstNmService.select(params);

        return Response.ok().put("page", page);
    }

    /**
     * 左边指标
     */
    @Override
    public Response leftIndex(@RequestParam Map<String, Object> params){
        List<Map<String, Object>> page = t07QltyFstNmService.leftIndex();

        return Response.ok().put("page", page);
    }

    /**
     * 城乡发展差异
     */
    @Override
    public Response bottomIndex1(@RequestParam Map<String, Object> params){
        List<Map<String, Object>> page = t07QltyFstNmService.bottomIndex1();

        return Response.ok().put("page", page);
    }

    /**
     * 人与资源环境
     */
    @Override
    public Response bottomIndex2(@RequestParam Map<String, Object> params){
        List<Map<String, Object>> page = t07QltyFstNmService.bottomIndex2();

        return Response.ok().put("page", page);
    }

    /**
     * 人与社会保障
     */
    @Override
    public Response bottomIndex3(@RequestParam Map<String, Object> params){
        List<Map<String, Object>> page = t07QltyFstNmService.bottomIndex3();

        return Response.ok().put("page", page);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T07QltyFstNm t07QltyFstNm){
		t07QltyFstNmService.save(t07QltyFstNm);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T07QltyFstNm t07QltyFstNm){
		t07QltyFstNmService.updateById(t07QltyFstNm);

        return Response.ok();
    }


}
