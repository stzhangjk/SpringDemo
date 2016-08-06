package com.stzhangjk.springdemo.dao;

import com.stzhangjk.springdemo.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserDAO {

    private HibernateTemplate template;

    public void insert(User user){
        template.save(user);
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    @Resource
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
}
