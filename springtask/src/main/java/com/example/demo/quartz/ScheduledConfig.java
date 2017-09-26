package com.example.demo.quartz;

import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 23:10 2017/9/12 0012
 */
@SpringBootConfiguration
public class ScheduledConfig {


    //定义jobDetail
    @Bean(name = "jobDetail1")
    public MethodInvokingJobDetailFactoryBean datailFactoryBean(@Qualifier("scheduledTask") ScheduledTask scheduledTask) {
        MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
        //设置对应的job对象
        bean.setTargetObject(scheduledTask);
        //设置scheduledTask 的方法
        bean.setTargetMethod("excute");
        return bean;
    }

    //定义trigger
    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(@Qualifier(value = "jobDetail1") MethodInvokingJobDetailFactoryBean jj) {
       // MethodInvokingJobDetailFactoryBean jobDetail = datailFactoryBean();
        CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
        bean.setJobDetail(jj.getObject());
        bean.setCronExpression("0/5 * * ? * *");//五秒执行一次
        return bean;
    }

    //定义 ScheduledFactoryBean
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(Trigger cronJobTrigger) {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(cronJobTrigger);
        return schedulerFactoryBean;
    }

}
