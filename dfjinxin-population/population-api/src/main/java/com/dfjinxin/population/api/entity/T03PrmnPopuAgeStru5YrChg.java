package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 常住人口年龄结构5年变迁
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t03_prmn_popu_age_stru_5_yr_chg")
public class T03PrmnPopuAgeStru5YrChg implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日期
	 */
	private String dateStat;

	/**
	 * 地域编码
	 */
	private String areaCode;

	/**
	 * 地域名称
	 */
	private String areaName;

	/**
	 * 单位
	 */
	private String unit;

	/**
	 * 人口占比
	 */
	private String ytyGrowth;

	/**
	 * 年龄段
	 */
	private String agePeriod;

}
