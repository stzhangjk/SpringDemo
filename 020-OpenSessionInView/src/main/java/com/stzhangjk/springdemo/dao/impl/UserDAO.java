package com.stzhangjk.springdemo.dao.impl;


import com.stzhangjk.springdemo.dao.IUserDAO;
import com.stzhangjk.springdemo.model.User;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDAO implements IUserDAO {

	/**hibernate方法封装*/
	private HibernateTemplate template;

	@Override
	public User load(int id) {
		return (User) template.load(User.class,id);
	}

	@Resource
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
