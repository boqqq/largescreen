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
 * @date 2019-10-22 10:16:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t05_popu_labr_work")
public class T05PopuLabrWork implements Serializable {
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
	 * 劳动生产率
	 */
	private String labrWorkRadio;

	/**
	 * 同比增长率
	 */
	private String ytyGrowth;

	/**
	 * 统计单位
	 */
	private String unit;

}
