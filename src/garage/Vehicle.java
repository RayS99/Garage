package garage;

public abstract class Vehicle {
	public String manufac;
	public String model;
	public int release_year;
	public int weight;
	public int wheel_count;
	
	public Vehicle(String manufac, String model, int release_year, int weight, int wheel_count) {		
			this.manufac = manufac;
			this.model = model;
			this.release_year = release_year;
			this.weight = weight;
			this.wheel_count = wheel_count;
		}

}
