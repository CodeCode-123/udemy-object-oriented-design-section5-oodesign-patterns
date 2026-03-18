package object_oriented_design_patterns.singleton_design_pattern;

public class PerformanceStage {
	private static PerformanceStage INSTANCE = null;
	private static int counter;
	// private constructor for singleton
	private PerformanceStage() {
		counter++;
	}
	
	public synchronized static PerformanceStage getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}
	
	public void turnOnLights() {
		System.out.println("turned on lights...");
	}
	
	public int getCounter() {
		return counter;
	}

}
