package com.udemy.udemy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.udemy.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}