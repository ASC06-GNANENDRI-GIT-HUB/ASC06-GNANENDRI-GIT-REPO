package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "LOGIN")
public class LoginEntity {
    @Id
    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password", nullable = false)
    private String password;

    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
