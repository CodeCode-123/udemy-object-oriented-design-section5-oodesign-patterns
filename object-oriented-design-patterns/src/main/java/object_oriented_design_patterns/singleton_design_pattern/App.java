package object_oriented_design_patterns.singleton_design_pattern;

public class App {
	public static void main(String[] args) {
		PerformanceStage stage = PerformanceStage.getInstance();
		stage.turnOnLights();
		System.out.println("counter: " + stage.getCounter());
		
		PerformanceStage stage2 = PerformanceStage.getInstance();
		System.out.println("counter: " + stage2.getCounter());
	}

}
