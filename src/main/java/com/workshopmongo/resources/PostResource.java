package com.workshopmongo.resources;
//Resource -> Controller

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongo.domain.Post;
import com.workshopmongo.resources.util.URL;
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
	
	@GetMapping(value="/titlesearch")
	//@RequestMapping(value="/titlesearch", method=RequestMethod.GET)
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value="text", defaultValue="") String text) throws UnsupportedEncodingException{
		text = URL.decodeParam(text);
		List<Post> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}
	
	
	
	
	
}
