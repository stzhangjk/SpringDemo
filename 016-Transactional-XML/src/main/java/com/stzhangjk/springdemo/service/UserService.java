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

    public void add(User user) {
        dao.insert(user);
        Log log = new Log();
        log.setMessage(user.getUsername() + " inserted!");
        logDAO.insert(log);
        System.out.println("add " + user.getUsername() + " done!");
    }

    public User getUser(int id) {
        return null;
    }

    public UserDAO getDao() {
        return dao;
    }

    @Resource
    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    public LogDAO getLogDAO() {
        return logDAO;
    }

    @Resource
    public void setLogDAO(LogDAO logDAO) {
        this.logDAO = logDAO;
    }
}
