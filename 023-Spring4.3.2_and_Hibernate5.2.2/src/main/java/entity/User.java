package entity;

import javax.persistence.*;

/**
 * Created by STZHANGJK on 2016/9/3.
 */
@Entity
@Table(name = "_user")
public class User {

    private int id;
    private String username;
    private String password;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false,unique = true,length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false,length = 30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
