package com.didi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didi.pojo.Banner;
import com.didi.service.BannerService;

@RestController
@RequestMapping("/banner")
@CrossOrigin("*")
public class BannerController {
	
	@Autowired
	private BannerService bannerService;

    @GetMapping("/list")
    public List<Banner> list() {
    	//1111
    	//222
		//333
    	//444
    	//555
    	//666

        return bannerService.list();
    }
    

}
