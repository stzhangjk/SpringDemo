package com.stzhangjk.springdemo.service;

import com.stzhangjk.springdemo.dao.UserDAO;
import com.stzhangjk.springdemo.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Grady on 2016.6.7.
 */
@Component("userService")
public class UserService {

    private UserDAO dao;


    public void add(User user){
        dao.insert(user);
        System.out.println("add "+user.getUsername()+" done!");
    }


    public UserDAO getDao() {
        return dao;
    }

    @Resource(name = "userDAO")
    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

}
