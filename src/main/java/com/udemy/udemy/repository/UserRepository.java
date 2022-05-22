package com.udemy.udemy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.udemy.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
