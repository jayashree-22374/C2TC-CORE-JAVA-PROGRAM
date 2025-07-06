package day8.Interface.MarkerInterface;

public class MarkerDemo {
	public static void main(String[] args) {
		
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registerable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}
