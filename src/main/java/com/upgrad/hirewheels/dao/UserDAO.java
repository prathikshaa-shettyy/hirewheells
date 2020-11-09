package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository("userDAO")
public interface UserDAO extends JpaRepository<User,Integer> {
    public List<User> findByFirstNameIgnoreCase(String firstName);
    public List<User> findByFirstNameOrLastNameIgnoreCase(String firstName, String lastName);
    public List<User> findByEmailIgnoreCase (String email);
    public List<User> findByMobileNoIgnoreCase(String mobileNo);

}
