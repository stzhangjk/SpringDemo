package login.dao;

import login.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Grady on 2016.5.10.
 */
@Repository
public class UserDAO {



    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获取指定用户名和密码匹配的用户记录
     *
     * @param username 用户名
     * @param password 密码
     * @return 匹配数
     */
    public int getMatchCount(String username, String password) {
        return jdbcTemplate.queryForInt("select count(*) from _user where _user.username = ? and _user.password = ?",
                new Object[]{username, password});
    }

    public User findUserByName(String username) {
        final User user = new User();
        jdbcTemplate.query("select * from _user where _user.username = ?",
                new Object[]{username}, new RowCallbackHandler() {
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setId(resultSet.getInt("id"));
                        user.setUsername(resultSet.getString("username"));
                        user.setPassword(resultSet.getString("password"));
                        user.setCredits(resultSet.getInt("credits"));
                    }
                });

        return user;
    }

    public void updateUserInfo(User user) {
        jdbcTemplate.update("update _user set _user.last_visit = ?,_user.last_ip = ?,_user.credits = ? where _user.id = ?",
                new Object[]{
                        user.getLastVisit(),
                        user.getLastIp(),
                        user.getCredits(),
                        user.getId()
                });
    }

}
