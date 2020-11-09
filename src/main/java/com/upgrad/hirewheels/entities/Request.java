package com.upgrad.hirewheels.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}