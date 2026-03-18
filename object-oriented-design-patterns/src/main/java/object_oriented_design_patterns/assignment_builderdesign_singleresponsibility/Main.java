package object_oriented_design_patterns.assignment_builderdesign_singleresponsibility;

public class Main {
	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder("medium")
				.cheese(true)
				.olives(true)
				.ham(false)
				.mushrooms(false)
				.pineapple(false)
				.build();
		System.out.println(pizza.toString());
	}
}
