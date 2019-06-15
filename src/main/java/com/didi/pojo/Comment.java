package com.didi.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "comment")
public class Comment {

	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	
	private String username;
	
	private String comment;
	
	private Date createtime;
	
	@Column(name = "news_id")
	private Integer newsId;
}
