package service;

import dao.UserDAO;
import entity.User;

/**
 * Created by Grady on 2016.6.7.
 */
public class UserService {

    private UserDAO dao;

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
}
