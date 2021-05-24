package garage;

import java.util.ArrayList;
import java.util.Random;

public class Garage {
	private ArrayList<Vehicle> vehiclesDocked = new ArrayList<>();
	private Random invoiceCost = new Random();
	private int garageLoad;
	
	public Garage(int load) {
		this.garageLoad = load;
	}
	
	public boolean isBay() {
		if (vehiclesDocked.size() >= 5) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void returnGarageLoad() {
		for (Vehicle vehicle : vehiclesDocked) {
			System.out.println(vehicle.getcolor() + " " + vehicle.getmake());
		}
	}
	
	public int repair(Vehicle vehicle) {
		vehicle.setserviced(true);
		return calcCost(vehicle);
	}
	
	public int calcCost(Vehicle vehicle) {
		int cost;
		if (vehicle.body() == "Semi") {
			cost = 8;
		} else if (vehicle.body() == "Car") {
			cost = 4;
		} else if (vehicle.body() == "Motorcycle") {
			cost = 2;
		} else {
			cost = 1;
		}
		cost = cost * this.invoiceCost.nextInt(1000);
		return cost;
	}
	
	public int calcCostTtl(ArrayList<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles ) {
			int cost;
			if (vehicle.body() == "Semi") {
				cost = 8;
			} else if (vehicle.body() == "Car") {
				cost = 4;
			} else if (vehicle.body() == "Motorcycle") {
				cost = 2;
			} else {
				cost = 1;
			}
			cost = cost * this.invoiceCost.nextInt(1000);
			return cost;
		}
		return -1;
	}
	
	public void removeID(int index) {
		this.vehiclesDocked.remove(index);
	}
	
	public void removeType(String type) {
		for (Vehicle i : vehiclesDocked) {
			int index = 0;
			if (i.body() == type) {
				this.vehiclesDocked.remove(index);
			}
			index++;
		}
	}
	
	public void emptyGarage() {
		for (int i = 0; i < vehiclesDocked.size(); i++) {
			vehiclesDocked.remove(i);
		}
	}
	public int getGarageLoad() {
		return garageLoad;
	}

	public void setGarageLoad(int garageLoad) {
		this.garageLoad = garageLoad;
	}

	public ArrayList<Vehicle> getVehiclesDocked() {
		return vehiclesDocked;
	}

	public void setVehiclesDocked(ArrayList<Vehicle> vehiclesDocked) {
		this.vehiclesDocked = vehiclesDocked;
	}
	
	public void addOneToGarage(Vehicle vehicle) {
		if (isBay() == true) {
			this.vehiclesDocked.add(vehicle);
			System.out.println(vehicle.getmake() + " was added to garage. Its bay is " + this.vehiclesDocked.size() + ".");
		}
		else {
			System.out.println("Garage is full!");
		}
	}
	
	public void addManyToGarage(ArrayList<Vehicle> vehicleList) {
		
		for (Vehicle vehicle : vehicleList) {
			if (isBay() == true) {
				this.vehiclesDocked.add(vehicle);
				System.out.println(vehicle.getmake() + " was added to garage. Its bay is " + this.vehiclesDocked.size() + ".");
			}
			else {
				System.out.println("Garage is full!");
			}
		}
	}

}