package com.example.demo.CateRepo;

import com.example.demo.pojo.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 22:58 2017/9/7 0007
 */
public interface CatRepository extends CrudRepository<Cat,Integer>
{

}
