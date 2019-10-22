package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 年龄组迁徙变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06AgeGrpChgFeat implements Serializable {
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
	 * 人口占比/值
	 */
	private String ytyGrowth;

	/**
	 * 指标维度
	 */
	private String unitType;

	/**
	 * 性别
	 */
	private String gender;

}
