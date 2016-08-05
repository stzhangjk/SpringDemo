package interceptor;

import dao.api.IUserDAO;
import dao.impl.UserDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Grady on 2016.8.5.
 */
public class LogInterceptor implements InvocationHandler{

    private Object target;

    private void beforeMethod(){
        System.out.println("log");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        method.invoke(target,args);
        return null;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
