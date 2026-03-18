package object_oriented_design_patterns.factory_pattern;

public class ElectricCar implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("pushed button started electric car's engine");
	}
}
