package day4;

public class StudentEntity {
	private static StudentEntity s1=new StudentEntity();
	
	public static StudentEntity getObj() {
		return s1;
	}
	private int id;
	private String name;
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + "]";
	}
	
	

}
