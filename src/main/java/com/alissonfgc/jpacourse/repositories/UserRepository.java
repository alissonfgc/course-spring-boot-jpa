package com.alissonfgc.jpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonfgc.jpacourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
