package dao.impl;

import dao.api.IUserDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Grady on 2016.8.5.
 */
public class UserDAO implements IUserDAO{

    @Override
    public void insert(){
        System.out.println("insert");
    }
}
