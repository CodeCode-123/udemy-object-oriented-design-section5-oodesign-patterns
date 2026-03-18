package object_oriented_design_patterns.coffeeshop_observer_pattern.client;

import object_oriented_design_patterns.coffeeshop_observer_pattern.coffeeshop.CoffeeAttendent;
import object_oriented_design_patterns.coffeeshop_observer_pattern.customers.Customer;

public class CoffeeShop {
	public static void main(String[] args) {
		Customer customerOne = new Customer("John", "Black Coffee");
		Customer customerTwo = new Customer("Mary", "Cappuccino");
		Customer customerThree = new Customer("William", "Latte");
		
		// initialize coffeeAttendent
		CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
		coffeeAttendent.takeOrder(customerOne);
		coffeeAttendent.takeOrder(customerTwo);
		coffeeAttendent.takeOrder(customerThree);
		
		// prepare drinks
		coffeeAttendent.prepareDrink("Black Coffee");
		coffeeAttendent.prepareDrink("Cappuccino");
		coffeeAttendent.prepareDrink("Latte");
		
		// order up...
		coffeeAttendent.callOutCompletedOrder();
	}
}
