package com.stzhangjk.springdemo.service;

import com.stzhangjk.springdemo.dao.LogDAO;
import com.stzhangjk.springdemo.dao.UserDAO;
import com.stzhangjk.springdemo.entity.Log;
import com.stzhangjk.springdemo.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserService {

    private UserDAO dao;
    private LogDAO logDAO;

    //@Transactional(propagation = Propagation.MANDATORY)//调用之前必须有事务，否则报异常
    @Transactional(propagation = Propagation.REQUIRED)//默认值，如果已经有事务，则添加，没有再新创建事务
    //@Transactional(propagation = Propagation.NESTED)//内嵌的事务
    //@Transactional(propagation = Propagation.NEVER)//不能有事务，否则报异常
    //@Transactional(propagation = Propagation.NOT_SUPPORTED)//不能有外层事务，如果有则挂起外层，执行完再让外层继续
    public void add(User user){
        dao.insert(user);
        Log log = new Log();
        log.setMessage(user.getUsername() + " inserted!");
        logDAO.insert(log);
        System.out.println("add "+user.getUsername()+" done!");
    }

    //rollbackfor ,什么情况下回滚
    //@Transactional(readOnly = true)//只读，建立只读Connection，效率比较高
    public User getUser(int id){
        return null;
    }

    @Resource
    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    @Resource
    public void setLogDAO(LogDAO logDAO) {
        this.logDAO = logDAO;
    }
}
