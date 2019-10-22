package com.dfjinxin.population.server.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dfjinxin.population.api.entity.T01PrmnPopuAgeMidDigit;
import com.dfjinxin.population.server.modules.service.T01PrmnPopuAgeMidDigitService;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT01PrmnPopuAgeMidDigitController;



/**
 * 常住人口年龄中位数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:18
 */
@RestController
public class T01PrmnPopuAgeMidDigitController implements IT01PrmnPopuAgeMidDigitController{

    @Autowired
    private T01PrmnPopuAgeMidDigitService t01PrmnPopuAgeMidDigitService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        List<T01PrmnPopuAgeMidDigit> list = t01PrmnPopuAgeMidDigitService.getList(params);

        return Response.ok().put("list", list);
    }



    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T01PrmnPopuAgeMidDigit t01PrmnPopuAgeMidDigit){
		t01PrmnPopuAgeMidDigitService.save(t01PrmnPopuAgeMidDigit);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T01PrmnPopuAgeMidDigit t01PrmnPopuAgeMidDigit){
		t01PrmnPopuAgeMidDigitService.updateById(t01PrmnPopuAgeMidDigit);

        return Response.ok();
    }


}
