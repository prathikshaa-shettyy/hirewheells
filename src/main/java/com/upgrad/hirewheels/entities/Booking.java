package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Entity
@Table(name = "BOOKING")
public class Booking {
    @Id
    private int booking_id;
    @Column(nullable = false)
    private Date pickup_date;
    @Column(nullable = false)
    private Date dropoff_date;
    @Column(nullable = false)
    private Date booking_date;
    @Column(length = 10,precision = 2)
    private int amount;

}
