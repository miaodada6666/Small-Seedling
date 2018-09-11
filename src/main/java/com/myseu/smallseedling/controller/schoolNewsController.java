package com.myseu.smallseedling.controller;

import com.myseu.smallseedling.domain.schoolNewsReposity;
import com.myseu.smallseedling.mapper.schoolNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class schoolNewsController {
    @Autowired
    private schoolNewsReposity newsReposity;

    //查询所有数据
    @GetMapping(value = "/schoolNews")
    public List<schoolNews> schoolNewsList(){
        return newsReposity.findAll();
    }
}
