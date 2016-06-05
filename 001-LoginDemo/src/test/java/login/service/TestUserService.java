package login.service;

import login.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Grady on 2016.5.12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void hasMatchUser(){
        boolean b1 = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","666666");
        Assert.assertTrue(b1);
        Assert.assertTrue(!b2);
    }

    @Test
    public void findUserByUsername(){
        User user = userService.findUserByUsername("admin");
        Assert.assertEquals(user.getUsername(),"admin");
    }
}
