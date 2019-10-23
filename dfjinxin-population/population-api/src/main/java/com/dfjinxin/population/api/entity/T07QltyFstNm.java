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
 * @date 2019-10-22 11:09:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t07_qlty_fst_nm")
public class T07QltyFstNm implements Serializable {
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
	 * 空气质量排名
	 */
	private String qltyFstNm;

	/**
	 * 优级天数
	 */
	private String practitionerNum;

	/**
	 * 统计单位
	 */
	private String unit;

}
