import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * Created by Grady on 2016.8.4.
 */
public class TestInitDes {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService)context.getBean("userService");
        UserService service2 = (UserService)context.getBean("userService");
        ((ClassPathXmlApplicationContext)context).destroy();
    }
}
