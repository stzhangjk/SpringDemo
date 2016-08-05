import com.stzhangjk.springdemo.entity.User;
import com.stzhangjk.springdemo.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Grady on 2016.8.5.
 */
public class Test007 {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService)context.getBean("userService");
        service.add(new User());
    }
}
