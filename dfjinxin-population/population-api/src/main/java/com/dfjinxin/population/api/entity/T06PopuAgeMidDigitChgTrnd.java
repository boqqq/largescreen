package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.ToString;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.IdType;
import com.dfjinxin.commons.core.util.LocalDateTimeJsonDeserializer;
import com.dfjinxin.commons.core.util.LocalDateTimeJsonSerializable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;

/**
 * 人口年龄中位数变化趋势
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 15:13:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T06PopuAgeMidDigitChgTrnd implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日期
	 */
	@TableId(value = "id", type = IdType.INPUT)
	@ToString.Include
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
