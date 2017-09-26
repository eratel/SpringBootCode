package com.example.demo.task;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 19:49 2017/9/10 0010
 */
@SpringBootConfiguration
@EnableScheduling
public class TaskConfig
{
    //指定    秒 分钟 小时 日期 月份 星期  年(可选)
    //10秒一次
    @Scheduled(cron = "0/10 * * * * *")
    public void test1()
    {
       // System.out.print("执行了test1方法");
    }

    //每一分钟打印一次
    @Scheduled(cron = "0 0/1 * * * *")
    public void test2()
    {
        //System.out.print("执行了test2方法");
    }
}
