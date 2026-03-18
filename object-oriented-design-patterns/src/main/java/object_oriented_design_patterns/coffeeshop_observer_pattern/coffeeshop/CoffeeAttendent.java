package object_oriented_design_patterns.coffeeshop_observer_pattern.coffeeshop;

import java.util.ArrayList;
import java.util.List;

import object_oriented_design_patterns.coffeeshop_observer_pattern.customers.Customer;
import object_oriented_design_patterns.coffeeshop_observer_pattern.customers.WaitingCustomer;

public class CoffeeAttendent {
	private List<Customer> customersList;
	private List<String> completedDrinks;
	
	public CoffeeAttendent() {
		customersList = new ArrayList<Customer>();
		completedDrinks = new ArrayList<String>();
	}
	
	public List<Customer> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(List<Customer> customerList) {
		this.customersList = customerList;
	}

	public List<String> getCompletedDrinks() {
		return completedDrinks;
	}

	public void setCompletedDrinks(List<String> completedDrinks) {
		this.completedDrinks = completedDrinks;
	}
	
	public void takeOrder(Customer customer) {
		if (customersList == null) {
			customersList = new ArrayList<>();
		}
		customersList.add(customer);
		System.out.println("Coffee Attendent: '" + customer.getName() 
		        + ", I've started working on your order of " 
				+ customer.getDrinkOrdered() + "'");
	} 
	
	public void prepareDrink(String drinkToBePrepared) {
		double timeTaken = Math.random() * 10; 
		try {
			Thread.sleep((long) (timeTaken) * 1000);
			completedDrinks.add(drinkToBePrepared);
		} catch (InterruptedException e) {
			System.out.println(" for some reason, drink was not prepared...");
		}
	}
	
	public void callOutCompletedOrder() {
		for (String readyDrink: completedDrinks) {
			System.out.println("Order up: " + readyDrink);
			for (Customer customer: customersList) {
				customer.orderReady(readyDrink);
			}
		}
	}
}
