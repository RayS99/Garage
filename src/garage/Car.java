package garage;

public class Car extends Vehicle {
	public Car(String make,String model, String color, boolean serviced) {
		this.setmodel(model);
		this.setmake(make);
		this.setwheelcount(4);
		this.setbody("Car");
		this.setcolor(color);
		this.setserviced(serviced);
	}
        
}

