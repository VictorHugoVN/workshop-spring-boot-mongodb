package com.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshopmongo.domain.User;
import com.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	//Serviço precisa conversar com o repositório
	@Autowired
	private UserRepository repo; // O próprio Spring fica responsável pela instanciação

	public List<User> findAll(){
		return repo.findAll();
	}
	
}
