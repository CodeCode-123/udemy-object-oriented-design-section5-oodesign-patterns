package object_oriented_design_patterns.observer_pattern.observers;

import object_oriented_design_patterns.observer_pattern.domain.Employee;

public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String msg) {
		System.out.println("HR department notified...");
		System.out.println(msg + employee.getName());
	}
}
