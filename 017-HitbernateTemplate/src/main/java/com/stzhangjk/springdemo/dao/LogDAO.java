package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.Log;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Grady on 2016.8.6.
 */
@Component
public class LogDAO {

    private HibernateTemplate template;

    public void insert(Log log){
        template.save(log);
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    @Resource
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
}
