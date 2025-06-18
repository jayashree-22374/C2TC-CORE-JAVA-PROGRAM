package Day3;

public class Constructorprogram {
		private int id;
		private String name;
		private String city;
		public Constructorprogram(){
			this.id=101;
			this.name="Jayashree";
			this.city="Chennai";
		}
		public Constructorprogram(int id,String name) {
			this.id=103;
			this.name="Pune";
		}
		public Constructorprogram(int id,String name,String city) {
			this.id=102;
			this.name="jack";
			this.city="Banglore";
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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Constructorprogram [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId()
					+ ", getName()=" + getName() + ", getCity()=" + getCity() +  "]";
		}
		
		

	}



