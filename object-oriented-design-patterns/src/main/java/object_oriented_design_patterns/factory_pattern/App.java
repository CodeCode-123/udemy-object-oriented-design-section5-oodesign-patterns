package object_oriented_design_patterns.factory_pattern;

public class App {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();
		
		vehicle = vehicleFactory.getVehicle(VehicleType.TRUCK);
		vehicle.startEngine();
	}

}
