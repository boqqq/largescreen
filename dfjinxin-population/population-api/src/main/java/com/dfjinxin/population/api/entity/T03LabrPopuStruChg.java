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
 * 劳动力人口结构变化
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T03LabrPopuStruChg implements Serializable {
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
	 * 类型
	 */
	private String type;

	/**
	 * 常住外来人口 
	 */
	private String ytyGrowth;

	/**
	 * 单位
	 */
	private String unit;

}
