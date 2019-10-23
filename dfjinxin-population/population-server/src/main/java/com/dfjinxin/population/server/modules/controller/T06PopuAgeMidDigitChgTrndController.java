package com.dfjinxin.population.server.modules.controller;

import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Response;
import com.dfjinxin.population.api.controller.IT06PopuAgeMidDigitChgTrndController;
import com.dfjinxin.population.api.entity.T06PopuAgeMidDigitChgTrnd;
import com.dfjinxin.population.server.modules.service.T06PopuAgeMidDigitChgTrndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 人口年龄中位数变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@RestController
public class T06PopuAgeMidDigitChgTrndController implements IT06PopuAgeMidDigitChgTrndController {

    @Autowired
    private T06PopuAgeMidDigitChgTrndService t06PopuAgeMidDigitChgTrndService;

    /**
     * 列表
     */
    @Override
    public Response list(@RequestParam Map<String, Object> params){
        PageUtils page = t06PopuAgeMidDigitChgTrndService.queryPage(params);

        return Response.ok().put("page", page);
    }

    /**
     * 列表
     */
    @Override
    public Response select(@RequestParam Map<String, Object> params){
        List<T06PopuAgeMidDigitChgTrnd> page = t06PopuAgeMidDigitChgTrndService.select(params);

        return Response.ok().put("page", page);
    }




    /**
     * 保存
     */
    @Override
    public Response save(@RequestBody T06PopuAgeMidDigitChgTrnd t06PopuAgeMidDigitChgTrnd){
		t06PopuAgeMidDigitChgTrndService.save(t06PopuAgeMidDigitChgTrnd);

        return Response.ok();
    }

    /**
     * 修改
     */
    @Override
    public Response update(@RequestBody T06PopuAgeMidDigitChgTrnd t06PopuAgeMidDigitChgTrnd){
		t06PopuAgeMidDigitChgTrndService.updateById(t06PopuAgeMidDigitChgTrnd);

        return Response.ok();
    }


}
