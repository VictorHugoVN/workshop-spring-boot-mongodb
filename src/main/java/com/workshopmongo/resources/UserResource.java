package com.workshopmongo.resources;
//Resource -> Controller

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongo.DTO.UserDTO;
import com.workshopmongo.domain.User;
import com.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	//Controller precisa conversar com o service
	
	@Autowired
	private UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List list = service.findAll();
		List<UserDTO> listDto = (List<UserDTO>) list.stream().map(x -> new UserDTO((User) x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(new UserDTO(obj));
	}

}
