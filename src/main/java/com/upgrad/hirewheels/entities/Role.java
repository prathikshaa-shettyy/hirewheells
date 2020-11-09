package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ROLE")
public class Role {
    @Id
    private int role_id;
    @Column(length = 50,nullable = false,unique = true)
    private String role_name;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private List<User> userList;

    public int getRole_id() {
        return role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}