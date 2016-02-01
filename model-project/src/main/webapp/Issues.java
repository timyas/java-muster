public class Issues {
	private int id;
	private String name;
	private String description;
	private String createDate;
	private String authorId;
	
	public Issues(){}
	
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
		this.authorId = authorId;
	}
	
	public int getAuthorId(){
		return authorId;
	}
	
	public String toString(){
		return id+" "+name;
	}
}
