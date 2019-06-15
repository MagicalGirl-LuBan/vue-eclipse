package com.didi.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.didi.pojo.Comment;
import com.didi.pojo.News;
@Mapper
public interface CommentMapper extends tk.mybatis.mapper.common.Mapper<Comment> {

}
