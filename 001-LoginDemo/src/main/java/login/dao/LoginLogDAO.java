package login.dao;

import login.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Grady on 2016.5.10.
 */
@Repository
public class LoginLogDAO {



    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        jdbcTemplate.update("insert into `_login_log`(uid,login_datetime,ip) values(?,?,?)",
                new Object[]{
                        loginLog.getUid(),
                        loginLog.getLoginDate(),
                        loginLog.getIp()
                });
    }
}
