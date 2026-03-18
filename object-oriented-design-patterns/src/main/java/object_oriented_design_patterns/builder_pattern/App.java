package object_oriented_design_patterns.builder_pattern;

public class App {
	public static void main(String[] args) {
		User websiteUser = new User
				.Builder("bobMax", "bobMax@gmail.com")
				.firstName("Bob")
				.lastName("Max")
				.phoneNumber(1234567890)
				.address("123 Main Street")
				.build();
		System.out.println(websiteUser.toString());
	}
}
