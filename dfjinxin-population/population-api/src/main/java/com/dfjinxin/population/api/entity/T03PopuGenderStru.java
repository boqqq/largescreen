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
 * 人口性别结构
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T03PopuGenderStru implements Serializable {
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
	 * 人口占比
	 */
	private String ytyGrowth;

	/**
	 * 年龄段
	 */
	private String agePeriod;

	/**
	 * 性别
	 */
	private String gender;

}
