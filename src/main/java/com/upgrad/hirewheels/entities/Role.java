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

}