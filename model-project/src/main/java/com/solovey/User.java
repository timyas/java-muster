package com.solovey;
public class User {
	private int id;
	private String login;
	private String password;
	private Role role; //many-to-one
	
	public User(){}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getLogin(){
		return login;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setRoleId(int roleId){
		this.roleId = roleId;
	}
	
	public int getRoleId(){
		return roleId;
	}
	
	public String toString(){
		return id+" "+login+" "+roleId;
	}

}
