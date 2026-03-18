package object_oriented_design_patterns.factory_pattern;

public class Car implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Started simple engine of car...");
	}
}
