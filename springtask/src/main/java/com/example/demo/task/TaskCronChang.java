package com.example.demo.task;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 20:12 2017/9/11 0011
 */
@RestController
@EnableScheduling
public class TaskCronChang implements SchedulingConfigurer
{
    private String expression = "0/5 * * * * *";

    @RequestMapping("changExpression")
    public String changExpression()
    {
        expression = "0/10 * * * * *";
        return "changExpression";
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar)
    {
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                //System.out.print("configureTasksRun" + new Date());
            }
        };

        Trigger trigger = new Trigger()
        {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext)
            {
                CronTrigger cronTrigger = new CronTrigger(expression);
                return cronTrigger.nextExecutionTime(triggerContext);
            }
        };

        taskRegistrar.addTriggerTask(runnable, trigger);
    }
}
