package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.Log;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Grady on 2016.8.6.
 */
@Component
public class LogDAO {

    private SessionFactory sessionFactory;

    public void insert(Log log){
        Session session = sessionFactory.getCurrentSession();
        session.save(log);
        throw new RuntimeException("异常");//spring自动回滚
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
