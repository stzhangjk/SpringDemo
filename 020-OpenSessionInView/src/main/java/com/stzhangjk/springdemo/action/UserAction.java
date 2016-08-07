package com.stzhangjk.springdemo.action;


import com.opensymphony.xwork2.ActionSupport;
import com.stzhangjk.springdemo.model.User;
import com.stzhangjk.springdemo.service.IUserService;
import com.stzhangjk.springdemo.service.impl.UserService;

import javax.annotation.Resource;


public class UserAction extends ActionSupport {

	private User user;
	
	private IUserService service = new UserService();

	@Override
	public String execute() throws Exception {

	    user = service.loadUser(3);
        return SUCCESS;
	}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IUserService getService() {
		return service;
	}

	@Resource
	public void setService(IUserService service) {
		this.service = service;
	}
}
