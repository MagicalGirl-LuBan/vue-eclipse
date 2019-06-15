package com.didi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didi.mapper.BannerMapper;
import com.didi.pojo.Banner;


@Service
public class BannerService {
	
	@Autowired
	private BannerMapper bannerMapper;
	
	
	public List<Banner> list(){
		return bannerMapper.selectAll();
	}




}
