package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "USERROLE")
public class UserRole {
    @Column(length = 5)
    private int user_id;
    @Column(length = 5)
    private int role_id;
}
