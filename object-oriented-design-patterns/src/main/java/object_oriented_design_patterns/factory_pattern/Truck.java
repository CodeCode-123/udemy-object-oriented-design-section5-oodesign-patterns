package object_oriented_design_patterns.factory_pattern;

public class Truck implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Started a large engine of truck...");
	}
}
