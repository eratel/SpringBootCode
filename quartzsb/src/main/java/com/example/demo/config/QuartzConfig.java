package com.example.demo.config;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 20:43 2017/9/13 0013
 */
@SpringBootConfiguration
public class QuartzConfig {

    @Autowired
    private SpringBeanFactory springBeanFactory;

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        //把job交给spring管理  这样job就能使用spring 产生的bean 了
        schedulerFactoryBean.setJobFactory(springBeanFactory);
        return schedulerFactoryBean;
    }

    @Bean
    public Scheduler scheduler(){
        return schedulerFactoryBean().getScheduler();
    }
}
