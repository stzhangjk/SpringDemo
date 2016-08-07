package com.stzhangjk.springdemo.dao.impl;


import com.stzhangjk.springdemo.dao.IUserDAO;
import com.stzhangjk.springdemo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDAO implements IUserDAO {

	public void save(User user) {
		System.out.println("user save");
	}

	public boolean checkUserExistsWithName(String username) {
		return false;
	}

}
