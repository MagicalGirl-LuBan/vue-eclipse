package com.didi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didi.mapper.GoodMapper;
import com.didi.mapper.NewsMapper;
import com.didi.pojo.Comment;
import com.didi.pojo.Good;
import com.didi.pojo.News;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class GoodService {
	
	@Autowired
	private GoodMapper goodMapper;
	
	
	public PageInfo<Good> list(Integer currentPage){
		
		 PageHelper.startPage(currentPage,2);
		 List<Good> goods = goodMapper.selectAll();
		 PageInfo<Good> pageInfo = new PageInfo<Good>(goods);
		 
		 return pageInfo;
	}


	public Good get(Integer id) {
		
		return goodMapper.selectByPrimaryKey(id);
	}


	




}
