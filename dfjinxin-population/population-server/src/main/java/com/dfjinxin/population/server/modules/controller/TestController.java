package com.dfjinxin.population.server.modules.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.Test;
import com.dfjinxin.population.server.modules.service.TestService;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.ITestController;
import com.dfjinxin.commons.core.util.api.Response;



/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-20 03:07:32
 */
@RestController
public class TestController implements ITestController{

    @Autowired
    private TestService testService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = testService.queryPage(params);

        return Response.ok().put("page", page);
    }


    /**
     * 信息
     */
    @Override
    public Response info(@PathVariable("id") Long id){
		Test test = testService.getById(id);

        return Response.ok().put("test", test);
    }

    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody Test test){
		testService.save(test);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody Test test){
		testService.updateById(test);

        return Response.ok();
    }

    /**
     * 删除
     */
    @Override
    public Response delete(@RequestBody Long[] ids){
		testService.removeByIds(Arrays.asList(ids));

        return Response.ok();
    }

}
