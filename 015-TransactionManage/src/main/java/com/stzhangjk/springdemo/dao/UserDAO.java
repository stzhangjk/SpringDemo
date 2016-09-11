package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserDAO {

    private SessionFactory sessionFactory;

    public void insert(User user){
        Session session = SessionFactoryUtils.getSession(sessionFactory,false);

        session.save(user);
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
