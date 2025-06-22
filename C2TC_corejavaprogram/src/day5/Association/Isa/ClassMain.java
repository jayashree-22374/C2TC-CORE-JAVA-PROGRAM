package day5.Association.Isa;

public class ClassMain {
	public static void main(String[] args) {

		Employee employee = new Employee("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
