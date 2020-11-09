package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "REQUESTSTATUS")
public class RequestStatus {
    @Id
    private int request_status_id;
    @Column(length = 50,nullable = false,unique = true)
    private String request_status_name;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    private Request requests;
}
