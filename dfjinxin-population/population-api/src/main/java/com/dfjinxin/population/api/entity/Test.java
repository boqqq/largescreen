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
 * @date 2019-10-20 03:07:32
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId(value = "id", type = IdType.INPUT)
	@ToString.Include
	private Long id;
	
	/**
	 * 用户姓名
	 */
	private String name;

	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonSerialize(using = LocalDateTimeJsonSerializable.class)
	@JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
	private LocalDateTime createTime;
	
	/**
	 * 修改时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonSerialize(using = LocalDateTimeJsonSerializable.class)
	@JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
	private LocalDateTime updateTime;
	
}
