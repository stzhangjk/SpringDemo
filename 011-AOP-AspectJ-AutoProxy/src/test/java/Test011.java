

import com.stzhangjk.springdemo.dao.impl.UserDAO;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Grady on 2016.8.5.
 */
public class Test011 {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDAO dao = (UserDAO)context.getBean("userDAO");
        dao.insert();
    }
}
