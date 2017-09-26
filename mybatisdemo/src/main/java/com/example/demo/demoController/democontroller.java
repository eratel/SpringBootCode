package com.example.demo.demoController;

import com.example.demo.catservice.DemoService;
import com.example.demo.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 15:33 2017/9/10 0010
 */
@RestController
public class democontroller {

    @Autowired
    public DemoService demoService;

    @RequestMapping("cat")
    public List<Cat> retunCat(String name) {
        List<Cat> likename = demoService.likename(name);
        return likename;
    }

    @RequestMapping("savecat")
    public Cat saveCat() {
        Cat cat = new Cat();
        cat.setAge(2);
        cat.setName("3");
        demoService.saveCat(cat);
        return cat;
    }

    //http://127.0.0.1:8080/update?id=1&name=100&age=100
    @GetMapping("update")
    public int update(Cat cat) {
        return demoService.update(cat);
    }

    @GetMapping("delete")
    public int delete(int id) {
        return demoService.delete(id);
    }

    @GetMapping("selectAll")
    public List<Cat> selectAll() {
        return demoService.selectAll();
    }

    @GetMapping("selectById")
    public Cat slelectById(int id, String name) {
        return demoService.selectById(id, name);
    }

    @GetMapping("selectByAge")
    public Cat slelectByAge(int age) {
        return demoService.selectByAge(age);
    }

    @GetMapping("select6")
    public List<Cat> select6(Cat cat) {
        return demoService.select6(cat);
    }

}
