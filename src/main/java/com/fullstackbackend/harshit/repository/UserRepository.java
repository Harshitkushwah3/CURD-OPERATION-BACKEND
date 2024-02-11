package com.fullstackbackend.harshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackbackend.harshit.model.User;

public interface UserRepository extends JpaRepository <User,Long>{

}
