package com.didi.pojo;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "news")
public class News {
	
	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	
	private String title;
	
	private Integer click;
	
	private String img;
	
	private Date createtime;
	
	private String content;

}
