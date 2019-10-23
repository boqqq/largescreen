package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 人口年龄中位数变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:10:02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06PopuAgeMidDigitChgTrnd implements Serializable {
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
	 * 年龄中位数
	 */
	private Integer middleCnt;

	/**
	 * 常住/户籍人口
	 */
	private String popuType;

}
