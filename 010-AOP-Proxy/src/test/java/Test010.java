import com.stzhangjk.springdemo.dao.api.IUserDAO;
import com.stzhangjk.springdemo.dao.impl.UserDAO;
import com.stzhangjk.springdemo.interceptor.LogInterceptor;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by Grady on 2016.8.5.
 */
public class Test010 {
    @Test
    public void test(){
        IUserDAO dao = new UserDAO();
        LogInterceptor log = new LogInterceptor();
        log.setTarget(dao);

        IUserDAO daoProxy = (IUserDAO)Proxy.newProxyInstance(dao.getClass().getClassLoader(),new Class[]{IUserDAO.class},log);
        daoProxy.insert();

    }
}
