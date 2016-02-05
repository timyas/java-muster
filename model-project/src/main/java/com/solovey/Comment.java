package com.solovey;

public class Comment {
	private int id;
	private String text;
	private String createDate;
	private int authorId;
	
	public Comment(){}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getText(){
		return text;
	}
	
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
	
	public String getCreateDate(){
		return createDate;
	}
	
	public void setAuthorId(int authorId){
		this.authorId = authorId;
	}
	
	public int getAuthorId(){
		return authorId;
	}
	
	public String toString(){
		return id+" "+text+" "+createDate+" "+authorId;
	}
	
	
}
