package com.example.demo.catservice;

import com.example.demo.maper.CatMapper;
import com.example.demo.pojo.Cat;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 15:32 2017/9/10 0010
 */
@Service
public class DemoService {
    @Autowired
    public CatMapper catMapper;

    @Autowired
    public PageHelper pageHelper;

    public List<Cat> likename(String name) {
        pageHelper.startPage(1, 2);
        List<Cat> likename = catMapper.likename(name);
        return likename;
    }

    @Transactional
    public void saveCat(Cat cat) {
        int save = catMapper.save(cat);
        System.out.print(save);
    }

    //添加事务
    @Transactional
    public int update(Cat cat) {
        return catMapper.update(cat);
    }

    @Transactional
    public int delete(int id) {
        return catMapper.delete(id);
    }

    public List<Cat> selectAll() {
        return catMapper.selectAll();
    }

    public Cat selectById(int id, String name) {
        return catMapper.selectByid(id, name);
    }

    public Cat selectByAge(int age) {
        return catMapper.selectByAge(age);
    }

    public List<Cat> select6(Cat cat) {
        return catMapper.select6(cat);
    }

}
