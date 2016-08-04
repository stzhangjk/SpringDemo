package dao;

import entity.User;

/**
 * Created by Grady on 2016.6.7.
 */
public class UserDAO {
    public void insert(User user){
        System.out.println("insert "+user.getUsername()+"done!");
    }
}
