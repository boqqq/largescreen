package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:33:14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06PopuBirthRateAndDeadRateTrnd implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 区域编码
	 */
	private String areaCode;

	/**
	 * 区域名称
	 */
	private String areaName;

	/**
	 * 统计年份
	 */
	private String dateStat;

	/**
	 * 人口出生率
	 */
	private String birthRate;

	/**
	 * 死亡率
	 */
	private String deadRate;

	/**
	 * 统计单位
	 */
	private String unit;

}
