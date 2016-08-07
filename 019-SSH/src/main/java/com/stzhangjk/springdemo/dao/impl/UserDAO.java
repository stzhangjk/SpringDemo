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

	public void save(User user) {
		template.save(user);
		System.out.println("user save");
	}

	public boolean checkUserExistsWithName(String username) {
		return false;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	@Resource
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
