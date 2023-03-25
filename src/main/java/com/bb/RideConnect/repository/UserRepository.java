package com.bb.RideConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.RideConnect.data.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
