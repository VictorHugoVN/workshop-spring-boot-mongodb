package com.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Query;

import com.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{'title': {$regex: ?0, $options: 'i'}}")
	// ?0 -> primeiro parâmetro do método
	List<Post> searchTitle(String text);
}
