package com.didi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didi.mapper.CommentMapper;
import com.didi.pojo.Comment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class CommentService {

	@Autowired
	private CommentMapper commentMapper;

	


	public PageInfo<Comment> list(Integer newsId, Integer currentPage) {
		Example example = new Example(Comment.class);
	    Criteria criteria = example.createCriteria();
	    criteria.andEqualTo("newsId", newsId);
	    example.setOrderByClause("createtime desc");
		
		
		PageHelper.startPage(currentPage,5);
		List<Comment> comments = commentMapper.selectByExample(example);
		PageInfo<Comment> pageInfo = new PageInfo<Comment>(comments);
		
		return pageInfo;
	}




	public void add(Comment obj) {
		obj.setCreatetime(new Date());
		commentMapper.insert(obj);
	}
}
