package garage;

public class Moto extends Vehicle{
	public Moto(String model, String make, String color, boolean serviced) {
		this.setmodel(model);
		this.setwheelcount(2);
		this.setmake(make);
		this.setbody("Motorcycle");
		this.setcolor(color);
		this.setserviced(serviced);
	}

}
