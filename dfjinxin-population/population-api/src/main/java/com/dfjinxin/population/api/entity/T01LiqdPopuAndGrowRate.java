package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;

/**
 * 流动人口及增长率
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:46
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t01_liqd_popu_and_grow_rate")
public class T01LiqdPopuAndGrowRate implements Serializable {
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
	 * 流动人口
	 */
	private String popuTotal;

	/**
	 * 增长率
	 */
	private String ytyGrowth;

	/**
	 * 单位
	 */
	private String unit;

}
