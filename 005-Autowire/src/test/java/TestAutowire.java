import com.stzhangjk.springdemo.entity.User;
import com.stzhangjk.springdemo.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Grady on 2016.6.10.
 */
public class TestAutowire {

    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService)context.getBean("userService");
        User u = new User();
        u.setUsername("username");
        service.add(u);
    }
}
