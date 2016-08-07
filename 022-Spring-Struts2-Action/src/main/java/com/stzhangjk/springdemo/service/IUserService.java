package com.stzhangjk.springdemo.service;


import com.stzhangjk.springdemo.model.User;

public interface IUserService {

    boolean exists(User u) throws Exception;

    void add(User u) throws Exception;

}