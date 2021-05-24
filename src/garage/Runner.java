package garage;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garageOne = new Garage(5);
		Car Aston = new Car("Aston Martin", "Vantage", "Green", false);
		Car Audi = new Car("Audi","A4","Black",false);
		Moto Yamaha = new Moto("Yamaha","Z6709","Yellow",false);
		Semi Mack = new Semi("Mack","Titan600","Black",false);
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(Aston);
		vehicles.add(Audi);
		vehicles.add(Yamaha);
		vehicles.add(Mack);
		
		garageOne.addOneToGarage(Yamaha);
		garageOne.addManyToGarage(vehicles);
		garageOne.returnGarageLoad();
		System.out.println(garageOne.calcCost(Audi));
	}

}
