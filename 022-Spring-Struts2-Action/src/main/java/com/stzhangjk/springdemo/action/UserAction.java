package com.stzhangjk.springdemo.action;


import com.opensymphony.xwork2.ActionSupport;
import com.stzhangjk.springdemo.model.User;
import com.stzhangjk.springdemo.service.IUserService;
import com.stzhangjk.springdemo.service.impl.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("user")   //对应struts.xml中的action的class属性值，把action给spring生成
public class UserAction extends ActionSupport {
	
	private String username;
	private String password;
	private String password2;
	
	private IUserService service = new UserService();

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		if(service.exists(u)) {
			return "fail";
		}
		service.add(u);
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public IUserService getService() {
		return service;
	}

	@Resource
	public void setService(IUserService service) {
		this.service = service;
	}
}
