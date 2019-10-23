package com.dfjinxin.population.server.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjinxin.population.api.entity.T03PopuGenderStru;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 人口性别结构
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Repository
@Mapper
public interface T03PopuGenderStruDao extends BaseMapper<T03PopuGenderStru> {

    @Select("select * from t03_popu_gender_stru where gender='男' order by substring(type, 3)+0")
    List<T03PopuGenderStru> findManAll();
    @Select("select * from t03_popu_gender_stru where gender='女' order by substring(type, 3)+0")
    List<T03PopuGenderStru> findWomanAll();
}
