package com.stzhangjk.springdemo.dao;


import com.stzhangjk.springdemo.model.User;

public interface IUserDAO {
    void save(User user);
    boolean checkUserExistsWithName(String username);
}
