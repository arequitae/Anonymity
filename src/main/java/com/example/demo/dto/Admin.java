package com.example.demo.dto;

public class Admin {
    Integer Id;
    Integer Auth;
    String Identity;
    String Name;
    String Pwd;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getAuth() {
        return Auth;
    }

    public void setAuth(Integer auth) {
        Auth = auth;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }
}
