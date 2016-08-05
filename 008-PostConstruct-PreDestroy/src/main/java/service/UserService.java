package service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserService {

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
