package com.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.workshopmongo.DTO.AuthorDTO;

@Document
public class Post implements Serializable{
	
	private final static long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Date date;
	private String title;
	private String body;
	private AuthorDTO author;
	
	public Post() {
		
	}
	
	public Post(String id, Date date, String title, String body, AuthorDTO author) {
		this.setId(id);
		this.setDate(date);
		this.setTitle(title);
		this.setBody(body);
		this.setUser(author);
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return this.body;
	}
	
	public void setUser(AuthorDTO author) {
		this.author = author;
	}
	
	public AuthorDTO getUser() {
		return this.author;
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
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
