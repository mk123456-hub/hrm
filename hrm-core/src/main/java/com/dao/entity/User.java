package com.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Administrator
 * @create 2020/12/14 0014 21:34
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date brith;
    private BigDecimal balance;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", brith=" + brith +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public User(int id, String username, String password, Date brith, BigDecimal balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.brith = brith;
        this.balance = balance;
    }

    public User() {
    }
}
