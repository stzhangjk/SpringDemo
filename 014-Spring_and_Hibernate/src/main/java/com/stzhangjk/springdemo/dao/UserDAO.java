package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserDAO {

    private SessionFactory sessionFactory;

    public void insert(User user){
        /*
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("insert "+user.getUsername()+"done!");
        */
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "mySessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
