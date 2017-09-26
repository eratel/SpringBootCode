package com.example.demo.quartz;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 23:07 2017/9/12 0012
 */

//任务执行类
@Component() //实例化这个bean
@EnableScheduling//通过@EnableScheduling注解开启对计划任务的支持
public class ScheduledTask {

    public void excute(){
        System.out.print("quartz执行"+new Date());
    }
}
