package com.stzhangjk.springdemo.dao;


import com.stzhangjk.springdemo.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Grady on 2016.6.7.
 */
@Component
public class UserDAO {

    private DataSource dataSource;

    public void insert(User user){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement pps = conn.prepareStatement("insert into _user(username,password) values(?,?)");
            pps.setString(1,user.getUsername());
            pps.setString(2,user.getPassword());
            pps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("insert "+user.getUsername()+"done!");
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Resource
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
