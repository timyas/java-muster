package main;

public class Users {
	private int id;
	private String login;
	private String password;
	private int roleId;
	
	public Users(){}
	
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
