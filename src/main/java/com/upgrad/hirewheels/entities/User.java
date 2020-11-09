package com.upgrad.hirewheels.entities;

import lombok.Data;

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
    private float walletMoney= 10000.00f;
    @ManyToMany
    private List<UserRole> userRoles;
    @OneToMany
    private List<Vehicle> vehicles;
    @OneToMany
    private List<Booking> bookings;
    @OneToMany
    private List<Request> requestList;
}
