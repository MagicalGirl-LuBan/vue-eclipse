package com.didi.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name = "good")
public class Good {
	
	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	
	private String title;
	
	private String content;
	
	private Integer click;
	
	private String img;
	
	@Column(name = "sell_price")
	private Double sellPrice;
	
	@Column(name = "market_price")
	private Double marketPrice;
	
	private Integer num;
	
	
	private Date createtime;
}
