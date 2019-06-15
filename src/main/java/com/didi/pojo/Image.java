package com.didi.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "image")
public class Image {
	
	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	
	private String url;
	
	private String content;
	
	private String title;
	
	private Integer cid;
	
	private Date createtime;
	
	private Integer click;
	
	
}
