package main;

public class Roles {
	private int id;
	
	private String name;
	
	public Roles(){}
	
	public Roles(int id, String name){
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
	
	public String toString(){
		return id+" "+name;
	}
}
