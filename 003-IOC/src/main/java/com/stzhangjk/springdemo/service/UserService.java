package com.stzhangjk.springdemo.service;

import com.stzhangjk.springdemo.dao.UserDAO;
import com.stzhangjk.springdemo.entity.User;

/**
 * Created by Grady on 2016.6.7.
 */
public class UserService {

    private UserDAO dao;

    public void add(User user){
        dao.insert(user);
        System.out.println("add "+user.getUsername()+" done!");
    }

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }
}
