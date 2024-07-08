package com.alissonfgc.jpacourse.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alissonfgc.jpacourse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User test = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(test);
	}

}
