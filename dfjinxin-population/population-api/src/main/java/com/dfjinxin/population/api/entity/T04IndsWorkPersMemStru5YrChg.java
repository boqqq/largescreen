package com.dfjinxin.population.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 08:55:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t04_inds_work_pers_mem_stru_5_yr_chg")
public class T04IndsWorkPersMemStru5YrChg implements Serializable {
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
	 * 统计单位
	 */
	private String unit;

	/**
	 * 行业类型编码
	 */
	private String workType;

	/**
	 * 行业类型说明
	 */
	private String workTypeDesc;

}
