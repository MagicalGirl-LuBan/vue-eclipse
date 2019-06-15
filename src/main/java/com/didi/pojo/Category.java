package com.didi.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "category")
public class Category {
	
	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	
	private String title;
}
