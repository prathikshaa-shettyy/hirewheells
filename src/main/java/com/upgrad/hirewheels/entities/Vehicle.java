package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "VEHICLE")
public class Vehicle {
    @Id
    private int vehicle_id;
    @Column(nullable = false,length = 50)
    private String vehicle_model;
    @Column(nullable = false,length = 10,unique = true)
    private int vehicle_number;
    @Column(nullable = false,length = 50)
    private String color;
    @Column(nullable = false,length = 1)
    private int availability_status;
    @Column(nullable = false,length = 500)
    private String vehicle_image_url;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    VehicleSubcategory vehicleSubcategory;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    FuelType fuelType;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    Location location;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    User user;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    List<Booking> bookingList;
    @OneToOne(mappedBy = "vehicle")
    Request request;
}
