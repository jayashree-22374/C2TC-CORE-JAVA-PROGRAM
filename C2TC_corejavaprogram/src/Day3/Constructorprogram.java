package Day3;

public class Constructorprogram {
		private int id;
		private String name;
		private String city;
		public Constructorprogram(){   // default constructor
			this.id=101;
			this.name="Jayashree";
			this.city="Chennai";
		}
		public Constructorprogram(int id,String name) {  // parameterized constructor
			this.id=id;
			this.name=name;
		}
		public Constructorprogram(int id,String name,String city) {  // parameterized constructor
			this.id=id;
			this.name=name;
			this.city=city;
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



