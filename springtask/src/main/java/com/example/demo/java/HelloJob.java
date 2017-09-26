package com.example.demo.java;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 21:10 2017/9/11 0011
 */
public class HelloJob implements Job
{
    @Override
    public void execute(JobExecutionContext context)
        throws JobExecutionException
    {
        System.out.print("helloJob--------------------" + new Date());
    }
}
