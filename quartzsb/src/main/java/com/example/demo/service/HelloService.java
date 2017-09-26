package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 17:19 2017/9/14 0014
 */
@Service
public class HelloService {

    public void hello(){
        System.out.print("helloService"+new Date());
    }
}
