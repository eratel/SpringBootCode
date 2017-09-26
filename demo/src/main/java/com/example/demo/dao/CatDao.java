package com.example.demo.dao;

import com.example.demo.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 21:17 2017/9/8 0008
 */
@Repository
public class CatDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Cat> selectByName(String selectByName)
    {
        String sql = "select * from cat where 1=1 AND name = ?";
        BeanPropertyRowMapper<Cat> objectBeanPropertyRowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);

        List<Cat> query = jdbcTemplate.query(sql, new Object[] {selectByName}, objectBeanPropertyRowMapper);
        return query;
    }

}
