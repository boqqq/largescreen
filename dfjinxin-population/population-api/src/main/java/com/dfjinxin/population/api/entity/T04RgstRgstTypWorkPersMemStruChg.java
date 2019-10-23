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
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-21 17:52:34
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T04RgstRgstTypWorkPersMemStruChg implements Serializable {
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
	 * 国有企业从业人员占比
	 */
	private String stateNumGrowth;

	/**
	 * 私营企业从业人员占比
	 */
	private String privateNumGrowth;

	/**
	 * 城镇私营企业从业人员占比
	 */
	private String statOwenNumGrowth;

	/**
	 * 城镇个体从业人员占比
	 */
	private String cityCollNum;

	/**
	 * 城镇集体单位从业人员占比
	 */
	private String cityCollNumGrowth;

	/**
	 * 其他企业从业人员占比
	 */
	private String otherNumGrowth;

	/**
	 * 统计单位
	 */
	private String unit;

}
