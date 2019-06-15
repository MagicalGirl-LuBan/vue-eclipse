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

import com.didi.pojo.Comment;
import com.didi.pojo.Good;
import com.didi.pojo.News;
import com.didi.service.GoodService;
import com.didi.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/good")
@CrossOrigin("*")
public class GoodController {
	
	@Autowired
	private GoodService goodService;

    @GetMapping("/list")
    public PageInfo<Good> list(@RequestParam(defaultValue = "1")Integer currentPage) {
        return goodService.list(currentPage);
        

    }
    
    @GetMapping("/{id}")
    public Good get(@PathVariable("id")Integer id) {
        return goodService.get(id);
        

    }
    
    


}
