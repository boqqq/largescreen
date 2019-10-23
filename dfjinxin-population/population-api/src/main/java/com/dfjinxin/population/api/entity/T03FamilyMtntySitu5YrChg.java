package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:39:27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t03_family_mtnty_situ_5_yr_chg")
public class T03FamilyMtntySitu5YrChg implements Serializable {
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
	 * 百分比
	 */
	private String ytyGrowth;

	/**
	 * 统计类型
	 */
	private String birthType;

	/**
	 * 
	 */
	private String ytyNum;

	/**
	 * 统计单位
	 */
	private String unit;

}
