package com.lxh.process.day_22;

import java.io.Serializable;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 14:36:24
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
