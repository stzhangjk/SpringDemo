package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserDAO {

    private SessionFactory sessionFactory;

    public void insert(User user){
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
