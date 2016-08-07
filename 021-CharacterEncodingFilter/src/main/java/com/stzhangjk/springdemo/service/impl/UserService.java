package com.stzhangjk.springdemo.service.impl;


import com.stzhangjk.springdemo.dao.IUserDAO;
import com.stzhangjk.springdemo.dao.impl.UserDAO;
import com.stzhangjk.springdemo.model.User;
import com.stzhangjk.springdemo.service.IUserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService implements IUserService {

    private IUserDAO dao = new UserDAO();

    public boolean exists(User u) throws Exception {
        return dao.checkUserExistsWithName(u.getUsername());
    }

    public void add(User u) throws Exception {
        dao.save(u);
    }

    public IUserDAO getDao() {
        return dao;
    }

    @Resource
    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }
}
