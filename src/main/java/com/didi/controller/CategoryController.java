package com.didi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didi.pojo.Banner;
import com.didi.pojo.Category;
import com.didi.service.BannerService;
import com.didi.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

    @GetMapping("/list")
    public List<Category> list() {
        return categoryService.list();
    }
}
