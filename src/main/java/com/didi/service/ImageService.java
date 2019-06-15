package com.didi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didi.mapper.ImageMapper;
import com.didi.mapper.NewsMapper;
import com.didi.pojo.Image;
import com.didi.pojo.News;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;


@Service
public class ImageService {
	
	@Autowired
	private ImageMapper imageMapper;
	
	



	public List<Image> getByCid(Integer cid) {
		
		if(cid == 0) {
			return imageMapper.selectAll();
		}
		
		Example example = new Example(Image.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("cid", cid);
		
		List<Image> list = imageMapper.selectByExample(example);
		
		return list;
	}





	public Image get(Integer id) {
		return imageMapper.selectByPrimaryKey(id);
	}




}
