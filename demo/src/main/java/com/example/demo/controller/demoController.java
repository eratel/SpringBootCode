package com.example.demo.controller;

import com.example.demo.CateService.CatService;
import com.example.demo.pojo.Cat;
import com.example.demo.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 21:53 2017/9/6 0006
 */
@RestController
public class demoController
{
    @GetMapping("hello")
    public String hello()
    {
        return "helloWord";
    }

    @GetMapping("/test")
    public Demo getDemo()
    {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setAddress("123333eee");
        demo.setName("张三");
        demo.setCeateTime(new Date());
        demo.setRemark("出现了吗");
        return demo;
    }

    @Autowired
    private CatService catService;

    @GetMapping("cat.html")
    public String save()
    {
        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("小明");
        catService.save(cat);
        return "save";
    }

    @GetMapping("del")
    public String  delete()
    {
        catService.delete(1);
        return "del";
    }

    @GetMapping("/cat/getAll")
    public Iterable<Cat> getAll()
    {
        Iterable<Cat> all = catService.getAll();
        return all;
    }

    @GetMapping("name/{name}")
    public Cat finByCatName(@PathVariable String name)
    {
        Cat cat = catService.finByCatName(name);
        return  cat;
    }

    @GetMapping("na/{name}")
    public  Cat finByNameT(@PathVariable String name)
        throws Exception
    {
        throw new Exception();
      //return  catService.findByName(name).get(0);
    }

}
