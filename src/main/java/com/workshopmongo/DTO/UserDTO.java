package com.workshopmongo.DTO;

import java.io.Serializable;

import com.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	
	private final static long serialVersionUID = 1L;
	private String id;
	private String nome;
	private String email;
	
	public UserDTO() {
		
	}
	

	public UserDTO(User obj) {
		this.setId(obj.getId());
		this.setNome(obj.getNome());
		this.setEmail(obj.getEmail());
	}

	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	

}
