package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ACTIVITY")
public class Activity {
    @Id
    private int activity_id;
    @Column(nullable = false, unique = true)
    private String activity_type;

}
