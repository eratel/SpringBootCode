package com.example.demo;

import com.example.demo.servert.Myservert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

//是一个组合注解@ComponentScan + @SpringBootConfiguration + @EnableAutoConfiguration
@SpringBootApplication
@ServletComponentScan //启动servert扫描
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean myservert1(){
        return new ServletRegistrationBean(new Myservert(),"/myservert");
    }
}
