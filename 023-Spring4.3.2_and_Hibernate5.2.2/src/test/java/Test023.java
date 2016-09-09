import dao.UserDAO;
import entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * Created by STZHANGJK on 2016/9/3.
 */
public class Test023 {
    @Test
    public void testSchema(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService)context.getBean("userService");
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        service.add(user);
    }
}
