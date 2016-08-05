package com.stzhangjk.springdemo.service;

import com.stzhangjk.springdemo.dao.UserDAO;
import com.stzhangjk.springdemo.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Grady on 2016.6.7.
 */
public class UserService {

    private UserDAO dao;
    private Set set;
    private List list;
    private Map map;

    public void add(User user){
        dao.insert(user);
        System.out.println("add "+user.getUsername()+" done!");
    }

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
