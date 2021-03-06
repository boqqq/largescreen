package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;

/**
 * 常住人口
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:35:47
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t01_prmn_popu")
public class T01PrmnPopu implements Serializable {
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
	 * 人口数量
	 */
	private BigDecimal popuTotal;

}
