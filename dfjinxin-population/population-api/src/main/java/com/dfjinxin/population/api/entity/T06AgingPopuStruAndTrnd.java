package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 老龄人口结构与趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:59:00
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06AgingPopuStruAndTrnd implements Serializable {
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
	 * 人口数量
	 */
	private BigDecimal popuTotal;

	/**
	 * 指标维度
	 */
	private String unitType;

}
