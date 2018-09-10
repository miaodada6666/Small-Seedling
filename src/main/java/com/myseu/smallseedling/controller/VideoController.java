package com.myseu.smallseedling.controller;

import com.google.gson.Gson;
import com.myseu.smallseedling.domain.Video;
import com.myseu.smallseedling.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {
    // Gson json转换
    Gson gson = new Gson();
    @Autowired
    private VideoMapper videoMapper;

    @GetMapping(value="/jiang")
    public String getVideoList(){
        // object --> json
        String educationlist = gson.toJson(videoMapper.findAll());
        return educationlist;
    }

}
