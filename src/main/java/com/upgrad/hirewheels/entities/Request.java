package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "REQUEST")
public class Request {
    @Id
    private int request_id;
    @Column(length = 500)
    private String user_comments;
    @Column(length = 500)
    private String admin_comments;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "request")
    List<RequestStatus> requestStatusList;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    Activity activity;
}