package com.stzhangjk.springdemo.service;


import com.stzhangjk.springdemo.model.User;

public interface IUserService {
    User loadUser(int id);
}