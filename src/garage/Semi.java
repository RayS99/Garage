package garage;

public class Semi extends Vehicle { 
	public Semi(String make,String model, String color, boolean serviced) {
	this.setmodel(model);
	this.setwheelcount(10);
	this.setmake(make);
	this.setbody("Semi");
	this.setcolor(color);
	this.setserviced(serviced);
	}
}
