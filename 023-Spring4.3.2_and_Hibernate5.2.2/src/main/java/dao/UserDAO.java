package dao;

import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by STZHANGJK on 2016/9/3.
 */
@Component
public class UserDAO {

    private SessionFactory sf;

    public void insert(User user){
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    @Resource
    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
}
