package com.didi.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "banner")
public class Banner {
	
	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	
	private String url;
	
	private String img;
	
//	@Column(name = "class_id")
//	private Integer classId;

}
