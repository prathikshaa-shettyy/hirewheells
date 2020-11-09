package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "VEHICLECATEGORY")
public class VehicleCategory {
   @Id
   private int  vehicle_category_id;
   @Column(length = 50,nullable = false,unique = true)
   private String vehicle_category_name;

}