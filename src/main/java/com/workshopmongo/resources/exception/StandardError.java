package com.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private final static long serialVersionUID = 1L;
	
	private long timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
		
	}
	
	public StandardError(long timestamp, Integer status, String error, String message, String path) {
		this.setTimesTemp(timestamp);
		this.setStatus(status);
		this.setError(error);
		this.setMessage(message);
		this.setPath(path);
	}
	
	
	public void setTimesTemp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public long getTimesTemp() {
		return this.timestamp;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getError() {
		return this.error;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}
	
	
	
	
	
	
	

}
