package com.example.demo.java;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import java.util.concurrent.TimeUnit;

public class Test {
    //使用quartz
    public static void main(String[] args)
            throws SchedulerException, InterruptedException {
        System.out.print("start");
        //获取Scheduler实例
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();
        System.out.print("<<<<<<"+scheduler.getSchedulerName()+">>>>>>>");
        //创建具体的jobDetail
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1").build();
        //创建触发点triger
        //每隔五秒触发一次
        SimpleScheduleBuilder simpleScheduleBuilder =
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("triger1", "group1")
                .startNow()
                .withSchedule(simpleScheduleBuilder)
                .build();
        //将jobDetail和 trigger交由scheduler安排触发
        scheduler.scheduleJob(jobDetail, trigger);
        //睡20秒  20秒后失效
        TimeUnit.SECONDS.sleep(20);
        scheduler.shutdown();
        System.out.print("scheduler.shutdown()");
    }
}
