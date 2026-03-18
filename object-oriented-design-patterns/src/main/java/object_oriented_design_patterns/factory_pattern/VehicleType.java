package object_oriented_design_patterns.factory_pattern;

public enum VehicleType {
	CAR {
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	ELECTRIC {
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	},
	TRUCK {
		public Vehicle getVehicle() {
			return new Truck();
		}
	};
	// can not initialize enum type
	abstract Vehicle getVehicle();
}
