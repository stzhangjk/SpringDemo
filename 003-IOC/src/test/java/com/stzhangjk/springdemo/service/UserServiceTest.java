package com.stzhangjk.springdemo.service;

import com.stzhangjk.springdemo.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Grady on 2016.6.7.
 */
public class UserServiceTest {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) context.getBean("userService");
        User user = new User();
        user.setUsername("admin");
        service.add(user);
    }
}
