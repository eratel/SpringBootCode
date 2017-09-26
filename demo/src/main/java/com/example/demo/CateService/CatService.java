package com.example.demo.CateService;

import com.example.demo.CateRepo.CatRepository;
import com.example.demo.CateRepo.CatRepository2;
import com.example.demo.dao.CatDao;
import com.example.demo.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 23:00 2017/9/7 0007
 */
@Service
public class CatService
{

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private CatRepository2 catRepository2;


    public void save(Cat cat)
    {
        catRepository.save(cat);
    }

    public Iterable<Cat> getAll()
    {
        Iterable<Cat> all = catRepository.findAll();
        return all;
    }

    public void delete(int id)
    {
        catRepository.delete(id);
    }


    public Cat finByCatName(String name){
        Cat catByName = catRepository2.findCatByName(name);
        return  catByName;
    }

    @Autowired
    private CatDao catDao;

    public List<Cat> findByName(String name)
    {
      return  catDao.selectByName(name);
    }
}
