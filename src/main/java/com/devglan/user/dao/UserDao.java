package com.devglan.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devglan.model.UserDetails;

@Repository
public interface UserDao extends JpaRepository<UserDetails, Long> {

	UserDetails findByEmail(String email);

}
