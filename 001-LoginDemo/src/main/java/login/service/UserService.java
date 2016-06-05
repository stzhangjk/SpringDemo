package login.service;

import login.dao.LoginLogDAO;
import login.dao.UserDAO;
import login.domain.LoginLog;
import login.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Grady on 2016.5.12.
 */
@Service
public class  UserService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private LoginLogDAO loginLogDAO;

    public boolean hasMatchUser(String username,String password){

        int match = userDAO.getMatchCount(username, password);
        return match > 0;
    }

    public User findUserByUsername(String username){
        return userDAO.findUserByName(username);
    }

    public void loginSuccess(User user){
        user.setCredits(user.getCredits() + 5);

        LoginLog log = new LoginLog();
        log.setUid(user.getId());
        log.setLoginDate(user.getLastVisit());
        log.setIp(user.getLastIp());

        userDAO.updateUserInfo(user);
        loginLogDAO.insertLoginLog(log);
    }

}
