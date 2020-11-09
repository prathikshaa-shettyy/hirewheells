package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "CITY")
public class City
{
    @Id
    private int cityId;
    @Column(nullable = false)
    private String cityName;
    @OneToMany
    private List<Location> locations;
}



