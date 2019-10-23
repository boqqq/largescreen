package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 老年人分布地图
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 19:02:19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06TheAgedDisbuMap implements Serializable {
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
	 * 指标值
	 */
	private Integer unitCnt;

	/**
	 * 老年人占比排名
	 */
	private Integer rankNo;

}
