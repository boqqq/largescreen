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
 * 常住人口年龄中位数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:36:18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t01_prmn_popu_age_mid_digit")
public class T01PrmnPopuAgeMidDigit implements Serializable {
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

}
