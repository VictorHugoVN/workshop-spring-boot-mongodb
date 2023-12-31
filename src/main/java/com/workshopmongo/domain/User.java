package com.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="user")//Indica que faz referência uma coleção do mongoDB
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String nome;
	private String email;
	@DBRef(lazy=true) // Atributo referenciando outra coleção do MongoDB
	// lazy=true -> Os posts só serão carregados se forem explicitamente acessados
	private List<Post> posts = new ArrayList<>();
	
	public User() {
	}
	
	
	public User(String id, String nome, String email) {
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
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
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	public List<Post> getPosts(){
		return this.posts;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
