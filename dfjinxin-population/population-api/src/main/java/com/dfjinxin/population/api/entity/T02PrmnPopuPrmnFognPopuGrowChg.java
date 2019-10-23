package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.ToString;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.dfjinxin.commons.core.util.LocalDateTimeJsonDeserializer;
import com.dfjinxin.commons.core.util.LocalDateTimeJsonSerializable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 常住人口与常住外来人口增长率变化趋势
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:39:03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T02PrmnPopuPrmnFognPopuGrowChg implements Serializable {
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
	 * 外来人口增长率
	 */
	private String wlGrowth;

	/**
	 * 常住人口增长率
	 */
	private String czGrowth;

	/**
	 * 单位
	 */
	private String unit;

}
