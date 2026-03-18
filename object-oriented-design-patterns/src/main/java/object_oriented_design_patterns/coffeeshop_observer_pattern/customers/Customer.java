package object_oriented_design_patterns.coffeeshop_observer_pattern.customers;

public class Customer implements WaitingCustomer {
	private String name;
	private String drinkOrdered;
	
	public Customer() {
		
	}
	
	public Customer(String name, String drinkOrdered) {
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrinkOrdered() {
		return drinkOrdered;
	}

	private void exitStore() {
		System.out.println(name+": Thank you, I've received my " + drinkOrdered 
				+ " and leaving the store now...");
	}

	@Override
	public void orderReady(String completedDrink) {
		if (drinkOrdered.equals(completedDrink)) {
			exitStore();
		}
	}
}
