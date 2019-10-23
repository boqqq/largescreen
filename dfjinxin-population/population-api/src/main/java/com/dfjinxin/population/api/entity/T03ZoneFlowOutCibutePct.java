package com.dfjinxin.population.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 各地区流出贡献占比
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T03ZoneFlowOutCibutePct implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 地域编码
	 */
	private String areaCode;

	/**
	 * 地域名称
	 */
	private String areaName;

	/**
	 * 日期
	 */
	private String dateStat;

	/**
	 * 流出占比
	 */
	private String ytyGrowth;

	/**
	 * 单位
	 */
	private String unit;

}
