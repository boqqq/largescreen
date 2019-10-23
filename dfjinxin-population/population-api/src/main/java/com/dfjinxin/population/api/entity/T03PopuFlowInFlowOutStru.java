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
 * 人口流入流出结构
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 18:12:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T03PopuFlowInFlowOutStru implements Serializable {
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
	 * 人数
	 */
	private String popuTotal;

	/**
	 * 单位
	 */
	private String unit;

}
