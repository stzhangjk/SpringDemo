package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by Grady on 2016.6.7.
 */

@Component("userDAO")
public class UserDAO {

    public void insert(User user){
        System.out.println("insert "+user.getUsername()+"done!");
    }

}
