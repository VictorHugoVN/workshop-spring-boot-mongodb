package com.workshopmongo.DTO;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}
	
	public CommentDTO(String text, Date date, AuthorDTO author) {
		this.setText(text);
		this.setDate(date);
		this.setAuthor(author);
	}
	
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	public AuthorDTO getAuthor() {
		return this.author;
	}
	

}
