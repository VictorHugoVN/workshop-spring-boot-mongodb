package com.workshopmongo.resources;
//Resource -> Controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongo.domain.Post;
import com.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	//Controller precisa conversar com o service
	
	@Autowired
	private PostService service;
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
}
