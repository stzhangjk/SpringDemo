package service;

import dao.UserDAO;
import entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by STZHANGJK on 2016/9/3.
 */
@Component
public class UserService {

    private UserDAO dao;

    public void add(User user){
        dao.insert(user);
    }

    @Resource
    public void setDao(UserDAO dao) {
        this.dao = dao;
    }
}
