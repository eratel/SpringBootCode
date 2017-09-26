package com.example.demo.CateRepo;

import com.example.demo.pojo.Cat;
import org.springframework.data.repository.Repository;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 20:30 2017/9/8 0008
 */
public interface CatRepository2 extends Repository<Cat, Integer>
{
    public Cat findCatByName(String Name);
}
