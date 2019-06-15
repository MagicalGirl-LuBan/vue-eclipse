package com.didi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.didi.pojo.Banner;
import com.didi.pojo.Comment;
import com.didi.service.BannerService;
import com.didi.service.CommentService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/comment")
@CrossOrigin("*")
public class CommentController {

	@Autowired
	private CommentService commentService;

    @GetMapping("/list/{newsId}")
    public PageInfo<Comment> list(@PathVariable("newsId")Integer newsId,@RequestParam(defaultValue = "1")Integer currentPage) {
        return commentService.list(newsId,currentPage);
    }
    
    
    @PostMapping("/add")
    public void add(Comment comment) {
        commentService.add(comment);
    }
}
