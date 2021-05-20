package garage;

public abstract class Vehicle {
	//NO BOATS ALLOWED ONLY LAND VEHICLES WITH WHEELS! NO BOAT STORAGE HERE OR OTHER STANGE THINGS LIKE HOVER CRAFTS! GO ELSEWHERE! KISS!
	private String make;
	private int wheelcount;
	private String color;
	private String model;
	private String body;
	private boolean serviced;
	
	//constructors
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public int getwheelcount() {
		return wheelcount;
	}
	public void setwheelcount(int wheelcount) {
		this.wheelcount = wheelcount;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String body() {
		return body;
	}
	public void setbody(String body) {
		this.body = body;
	}
	public boolean serviced() {
		return serviced;
	}
	public void setserviced(boolean serviced) {
		this.serviced = serviced;
	}
}