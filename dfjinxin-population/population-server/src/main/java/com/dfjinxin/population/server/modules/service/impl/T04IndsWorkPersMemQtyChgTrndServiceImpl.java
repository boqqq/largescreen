package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.commons.core.util.WrapperUtils;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemQtyChgTrndVo;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStruVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T04IndsWorkPersMemQtyChgTrndDao;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemQtyChgTrnd;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemQtyChgTrndService;


@Service("t04IndsWorkPersMemQtyChgTrndService")
public class T04IndsWorkPersMemQtyChgTrndServiceImpl extends ServiceImpl<T04IndsWorkPersMemQtyChgTrndDao, T04IndsWorkPersMemQtyChgTrnd> implements T04IndsWorkPersMemQtyChgTrndService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04IndsWorkPersMemQtyChgTrnd> page = this.page(
                new Query<T04IndsWorkPersMemQtyChgTrnd>().getPage(params),
                new QueryWrapper<T04IndsWorkPersMemQtyChgTrnd>()
        );

        return new PageUtils(page);
    }

    @Override
    public T04IndsWorkPersMemStruVo getData(Map<String, Object> params) {
        QueryWrapper wrapper = WrapperUtils.createWrapper(params);

        List<Map<String, String>> dates = baseMapper.getDateList(params);
        List<Map<String, String>> list = baseMapper.getList(params);

        List<String> year = new ArrayList<>();
        List<String> desc = new ArrayList<>();

        List<List<Double>> lists = new ArrayList<>();
        List<Double> item;
        dates.stream().forEach(x->{
            year.add(x.get("dateStat"));
        });
        for (int i = 0; i < list.size(); i ++) {
            desc.add(list.get(i).get("type"));
            for (int j = 0; j < year.size(); j ++) {
                item =  new ArrayList<>();
                item.add(Double.parseDouble(i+1+""));
                item.add(Double.parseDouble(j+1+""));
                item.add(Double.parseDouble(list.get(i).get(year.get(j))));
                lists.add(item);
            }
        }
        T04IndsWorkPersMemStruVo result = new T04IndsWorkPersMemStruVo();
        desc.add(0, "");
        year.add(0, "");
        result.setDesc(desc);
        result.setYear(year);
        result.setLists(lists);
        return result;
    }
}
