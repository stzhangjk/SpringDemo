package com.stzhangjk.springdemo.dao.impl;

import com.stzhangjk.springdemo.dao.api.IUserDAO;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {

    //不实现接口的话，得用CGLIB（直接操作字节码,产生代理）
    //@Override
    public void insert(){
        System.out.println("insert");
        //throw new RuntimeException("异常");
    }
}
