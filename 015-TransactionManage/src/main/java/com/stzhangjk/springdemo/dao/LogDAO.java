package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Grady on 2016.8.6.
 */
@Component
public class LogDAO {

    private SessionFactory sessionFactory;

    public void insert(Log log){
        Session session = SessionFactoryUtils.getSession(sessionFactory,false);
        session.save(log);
        //throw new RuntimeException("异常");//spring自动回滚
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
