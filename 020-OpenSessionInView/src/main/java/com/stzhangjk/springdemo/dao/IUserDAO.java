package com.stzhangjk.springdemo.dao;


import com.stzhangjk.springdemo.model.User;

public interface IUserDAO {
    User load(int id);
}
