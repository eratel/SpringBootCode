package com.example.controller;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 21:57 2017/9/21 0021
 */
@RestController
public class MovieController
{

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("find")
    public User findById(String id){
        User user = this.restTemplate.getForObject("http://localhost:8800/findById?id="+id,User.class);
        return user;
    }

}
