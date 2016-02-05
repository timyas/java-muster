package com.solovey;

import java.util.List;

public class Issue {
	private int id;
	private String name;
	private String description;
	private String createDate;
	private String userAuthor;
	private List <String> comments;
	
	Issue(){}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
	
	public String getCreateDate(){
		return createDate;
	}
	
	public void setAuthorId(int authorId){
		this.id = authorId;
	}
	
	public int getAuthorId(){
		return id;
	}
	
	public String toString(){
		return id+" "+name; //String formatter equals() + hashCode();
	}
}
