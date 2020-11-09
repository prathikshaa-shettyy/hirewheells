package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "USER")
public class User {

    @Id
    private int user_id;
    @Column(nullable = false)
    private String first_name;
    private String last_name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false,length = 50)
    private String password;
    @Column(nullable = false, unique = true)
    private int mobile_no;
    @Column(length = 10, precision = 2)
    private float walletMoney= 10000;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public float getWalletMoney() {
        return walletMoney;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setWalletMoney(float walletMoney) {
        this.walletMoney = walletMoney;
    }
}
