package com.example.demo.job;

import com.example.demo.service.HelloService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 20:46 2017/9/13 0013
 */
@Component
public class HelloJob implements Job {

    @Autowired
    private HelloService helloService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.print("Hellojob"+new Date());
        helloService.hello();
    }
}
