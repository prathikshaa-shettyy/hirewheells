package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "VEHICLESUBCATEGORY")
public class VehicleSubcategory {
    @Id
    private int vehicle_subcategory_id;
    @Column(nullable = false,unique = true)
    private String vehicle_subcategory_name;
    @Column(length = 10,precision = 2,nullable = false)
    private int price_per_day;
    @ManyToOne
    VehicleCategory vehicleCategory;
    @OneToMany
    List<Vehicle> vehicleList;


}