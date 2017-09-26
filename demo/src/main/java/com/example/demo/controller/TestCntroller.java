package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 11:28 2017/9/9 0009
 */
@Controller
public class TestCntroller
{
    @RequestMapping("/hello1")
    public String helloftl()
    {
        return "helloftl";
    }

    @RequestMapping("hellohtml")
    public String hellojsp(Model model)
    {
        // ModelAndView modelAndView = new ModelAndView("hellohtml");
        model.addAttribute("name","Dear");
        return "hellohtml";
    }

}
