package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "FUELTYPE")
public class FuelType {
    @Id
    private int fuel_type_id;
    @Column(nullable = false,unique = true)
    private String fuel_type;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "fueltype")
    List<Vehicle> vehicleList;


}