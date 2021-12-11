package com.dream.codechallenge.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dream.codechallenge.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
