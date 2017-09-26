package com.example.demo.task;

import com.example.demo.job.HelloJob;
import com.example.demo.service.HelloService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class Mytask {

    @Autowired
    private Scheduler scheduler;


    @PostConstruct //init-method
    public void inint() throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1").build();
        //withIntervalInSeconds(5) 间隔五秒触发一次
        //withIntervalInMiuntes()分钟 withIntervalInHours()小时
        //withRepatCount() 总共执行次数
        //repeatForever() 重复执行
        SimpleScheduleBuilder simpleScheduleBuilder =
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("triger1", "group1")
                .startNow()
                .withSchedule(simpleScheduleBuilder)
                .build();
        scheduler.scheduleJob(jobDetail, trigger);//开启 gogogo
    }

//    @PostConstruct //init-method
//    public void inint() throws SchedulerException {
//        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1").build();
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("triger1", "group1")
//                .withSchedule(cronSchedule("0/5 * * ? * *")
//                        .withMisfireHandlingInstructionFireAndProceed())
//                .forJob("job1","group1").build();
//        scheduler.scheduleJob(jobDetail, trigger);
//    }

}




















