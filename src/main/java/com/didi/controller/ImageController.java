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

import com.didi.pojo.Image;
import com.didi.pojo.News;
import com.didi.service.ImageService;
import com.didi.service.NewsService;


@RestController
@RequestMapping("/image")
@CrossOrigin("*")
public class ImageController {
	
	@Autowired
	private ImageService imageService;


    
    
    @GetMapping("/getByCid/{cid}")
    public List<Image> getByCid(@PathVariable("cid")Integer cid) {
        return imageService.getByCid(cid);
    }
    
    @GetMapping("/{id}")
    public Image get(@PathVariable("id")Integer id) {
        return imageService.get(id);
    }
    
    
    

}
