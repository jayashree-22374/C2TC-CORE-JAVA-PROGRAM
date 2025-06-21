package day5.Association.Hasa;

public class Executor {
	public static void main(String[] args) {
		Address ad = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
		Person ps = new Person("Aniket Pawar", ad);
		ps.displayInfo();
	}

}
