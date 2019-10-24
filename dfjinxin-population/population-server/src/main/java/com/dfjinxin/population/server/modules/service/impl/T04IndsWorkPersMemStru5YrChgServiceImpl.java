package com.dfjinxin.population.server.modules.service.impl;

import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStru5YrChgVo;
import com.dfjinxin.population.server.modules.dto.T04IndsWorkPersMemStruVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dfjinxin.commons.core.util.api.PageUtils;
import com.dfjinxin.commons.core.util.api.Query;

import com.dfjinxin.population.server.modules.dao.T04IndsWorkPersMemStru5YrChgDao;
import com.dfjinxin.population.api.entity.T04IndsWorkPersMemStru5YrChg;
import com.dfjinxin.population.server.modules.service.T04IndsWorkPersMemStru5YrChgService;


@Service("t04IndsWorkPersMemStru5YrChgService")
public class T04IndsWorkPersMemStru5YrChgServiceImpl extends ServiceImpl<T04IndsWorkPersMemStru5YrChgDao, T04IndsWorkPersMemStru5YrChg> implements T04IndsWorkPersMemStru5YrChgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<T04IndsWorkPersMemStru5YrChg> page = this.page(
                new Query<T04IndsWorkPersMemStru5YrChg>().getPage(params),
                new QueryWrapper<T04IndsWorkPersMemStru5YrChg>()
        );

        return new PageUtils(page);
    }

    @Override
    public T04IndsWorkPersMemStruVo getData(Map<String, Object> params) {

        List<Map<String, String>> dates = baseMapper.getDateList(params);
        List<Map<String, String>> list = baseMapper.getList(params);

        List<String> year = new ArrayList<>();
        List<String> desc = new ArrayList<>();

        List<List<Double>> lists = new ArrayList<>();
        List<Double> item;
        dates.stream().forEach(x->{
            year.add(x.get("dateStat"));
        });
        Collections.reverse(year);
        for (int i = 0; i < year.size(); i ++) {
            item =  new ArrayList<>();
            for (int j = 0; j < list.size(); j ++) {
                if (!desc.contains(list.get(j).get("type"))) {
                    desc.add(list.get(j).get("type"));
                }
                item.add(Double.parseDouble(list.get(j).get(year.get(i))));
            }
            lists.add(item);
        }
        T04IndsWorkPersMemStruVo result = new T04IndsWorkPersMemStruVo();
        result.setDesc(desc);
        result.setYear(year);
        result.setLists(lists);
        return result;
    }
}
