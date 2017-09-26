package com.example.dao;

import com.example.pojo.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 22:01 2017/9/19 0019
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
