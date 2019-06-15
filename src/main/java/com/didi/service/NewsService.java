package com.didi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.didi.mapper.NewsMapper;
import com.didi.pojo.News;


@Service
public class NewsService {
	
	@Autowired
	private NewsMapper newsMapper;
	
	
	public List<News> list(){
		return newsMapper.selectAll();
	}


	public News get(Integer id) {
		
		return newsMapper.selectByPrimaryKey(id);
	}




}
