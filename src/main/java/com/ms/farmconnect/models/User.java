/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ms.farmconnect.models;

public class User {
    private String name;
    private String mobile;
    private String password;

    // Constructor
    public User(String name, String mobile, String password) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // You can override the toString method if needed
    @Override
    public String toString() {
        return "User [name=" + name + ", mobile=" + mobile + ", password=" + password + "]";
    }
}

