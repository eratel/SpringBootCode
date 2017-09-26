package com.example.controller;

import com.example.dao.UserRepository;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 22:08 2017/9/19 0019
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findById")
    public User findById(long id) {
        User one = userRepository.findOne(id);
        return one;
    }

}
