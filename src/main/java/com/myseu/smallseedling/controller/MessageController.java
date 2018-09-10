package com.myseu.smallseedling.controller;


import com.myseu.smallseedling.domain.MessageReposity;
import com.myseu.smallseedling.mapper.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private MessageReposity messageReposity;

    //查询所有数据
    @GetMapping(value = "/message")
    public List<Message> messageList(){
        return messageReposity.findAll();
    }
}
