package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//配置fastjson
public class DemoApplication //extends WebMvcConfigurerAdapter
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters)
//    {
//        //先定义 converter 转换信息
//        FastJsonHttpMessageConverter fastConver = new FastJsonHttpMessageConverter();
//        //添加 fastJsonConfig 的配置信息 是否格式化返回json 数据
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(
//            SerializerFeature.PrettyFormat
//        );
//        //在convert 中添加配置信息
//        fastConver.setFastJsonConfig(fastJsonConfig);
//        // 定义好的Converter 放到 参数中的list 当中
//        converters.add(fastConver);
//    }

}
