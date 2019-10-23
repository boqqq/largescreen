package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 老年抚养比变化特征
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:47:52
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06BringChgFeat implements Serializable {
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
	 * 同比增长率
	 */
	private String ytyGrowth;

}
