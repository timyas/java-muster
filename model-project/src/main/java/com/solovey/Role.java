package com.solovey;

public class Role {
	private int id;
	
	private String name;
	
	public Role(){}
	
	public Role(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return String.format("%2d --> %s", id, name);
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Role)) return false;
		Role role = (Role)obj;	
		return this.id == role.id && this.name.equals(role.name);
	}
	@Override
	public int hashCode(){
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + name.hashCode();
		return result;
	}
}
