package object_oriented_design_patterns.assignment_builderdesign_singleresponsibility;

public class Pizza {
	private final String size;
	private final boolean cheese;
	private final boolean olives;
	private final boolean ham;
	private final boolean mushrooms;
	private final boolean pineapple;
	
	private Pizza(Builder builder) {
		this.size = builder.size;
		this.cheese = builder.cheese;
		this.olives = builder.olives;
		this.ham = builder.olives;
		this.mushrooms = builder.mushrooms;
		this.pineapple = builder.pineapple;
	}
	
	@Override
	public String toString() {
		return "Pizza [size=" + size 
				+ ", cheese: " + cheese 
				+ ", olives: " + olives 
				+ ", mushrooms: " + mushrooms 
				+ ", pineapple: " + pineapple + "]";
	}
	
	public static class Builder {
		private String size;
		private boolean cheese;
		private boolean olives;
		private boolean ham;
		private boolean mushrooms;
		private boolean pineapple;
		
		public Builder(String size) {
			this.size = size;
		}
		
		public Builder cheese(boolean value) {
			this.cheese = value;
			return this;
		}
		
		public Builder olives(boolean value) {
			this.olives = value;
			return this;
		}
		
		public Builder ham(boolean value) {
			this.ham = value;
			return this;
		}
		
		public Builder mushrooms(boolean value) {
			this.mushrooms = value;
			return this;
		}
		
		public Builder pineapple(boolean value) {
			this.pineapple = value;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
	}
}
