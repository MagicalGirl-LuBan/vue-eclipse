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


import com.didi.pojo.News;
import com.didi.service.NewsService;


@RestController
@RequestMapping("/news")
@CrossOrigin("*")
public class NewsController {
	
	@Autowired
	private NewsService newsService;

    @GetMapping("/list")
    public List<News> list() {
        return newsService.list();
    }
    
    
    @GetMapping("/{id}")
    public News get(@PathVariable("id")Integer id) {
        return newsService.get(id);
    }

}
