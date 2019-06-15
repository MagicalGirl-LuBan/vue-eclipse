package com.didi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didi.mapper.BannerMapper;
import com.didi.mapper.CategoryMapper;
import com.didi.pojo.Banner;
import com.didi.pojo.Category;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.selectAll();
	}




}
