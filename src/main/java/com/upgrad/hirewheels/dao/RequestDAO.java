package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("requestDAO")
public interface RequestDAO extends JpaRepository<Request,Integer> {
}
