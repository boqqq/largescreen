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
 *
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2019-10-22 09:26:13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t04_inds_work_pers_mem_stru_chg_trnd")
public class T04IndsWorkPersMemStruChgTrnd implements Serializable {
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
	 * 从业人员第一产业
	 */
	private String industrialNum;

	/**
	 * 从业人员第二产业
	 */
	private String agroNum;

	/**
	 * 从业人员第三产业
	 */
	private String tertiaryIndustryNum;

	/**
	 * 统计单位
	 */
	private String unit;

}
