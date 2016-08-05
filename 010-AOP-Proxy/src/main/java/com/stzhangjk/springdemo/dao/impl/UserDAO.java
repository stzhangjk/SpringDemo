package com.stzhangjk.springdemo.dao.impl;

import com.stzhangjk.springdemo.dao.api.IUserDAO;

/**
 * Created by Grady on 2016.8.5.
 */
public class UserDAO implements IUserDAO{

    @Override
    public void insert(){
        System.out.println("insert");
    }
}
