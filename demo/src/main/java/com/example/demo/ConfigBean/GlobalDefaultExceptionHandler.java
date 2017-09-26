package com.example.demo.ConfigBean;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 21:47 2017/9/8 0008
 */

@ControllerAdvice
public class GlobalDefaultExceptionHandler
{
    @ExceptionHandler
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest request , Exception e){
        return "服务器很忙 请稍后使用！";
    }
}
