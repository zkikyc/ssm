package com.kikyc.bean;

import java.io.Serializable;

public class User implements Serializable {

    private String userId;
    private String Name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", Name='" + Name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String userId, String name, String password) {
        this.userId = userId;
        Name = name;
        this.password = password;
    }
}
