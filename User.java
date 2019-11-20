package com.sdut.community.Dao;

public class User {
    private Integer id;
    private String name;
    private Integer masterID;
    private String IDnumber;
    private String username;
    private String password;
    private String sex;

    public User() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(int id, String name, int masterID, String IDnumber) {
        this.id = id;
        this.name = name;
        this.masterID = masterID;
        this.IDnumber = IDnumber;
    }

    public User(String name, int masterID, String IDnumber) {
        this.name = name;
        this.masterID = masterID;
        this.IDnumber = IDnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMasterID() {
        return masterID;
    }

    public void setMasterID(Integer masterID) {
        this.masterID = masterID;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
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
}
