import com.stzhangjk.springdemo.entity.User;
import com.stzhangjk.springdemo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Grady on 2016.8.6.
 */
public class Test014 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService)context.getBean("userService");
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        service.add(user);
    }
}
