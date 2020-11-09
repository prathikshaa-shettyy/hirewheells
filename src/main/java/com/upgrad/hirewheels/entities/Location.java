package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "LOCATION")
public class Location {
    @Id
    private int location_id;
    @Column(nullable = false,length = 50)
    private String location_name;
    @Column(nullable = false,length = 100)
    private String address;
    @Column(nullable = false,length = 6)
    private int pincode;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    City city;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private List<Vehicle> vehicles;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private List<Booking> bookingList;

}