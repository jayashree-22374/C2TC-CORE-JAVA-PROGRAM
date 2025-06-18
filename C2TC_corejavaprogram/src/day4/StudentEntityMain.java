package day4;

public class StudentEntityMain {
	public static void main(String[]args){
		StudentEntity st=StudentEntity.getObj();
		
		st.setId(101);
		st.setName("Jayashree");
		
		StudentEntity st1=StudentEntity.getObj();
		System.out.println(st);
		System.out.println(st1);
	}

}
