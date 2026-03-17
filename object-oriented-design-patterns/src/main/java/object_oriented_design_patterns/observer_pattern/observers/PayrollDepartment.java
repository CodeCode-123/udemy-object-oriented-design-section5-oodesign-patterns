package object_oriented_design_patterns.observer_pattern.observers;

import object_oriented_design_patterns.observer_pattern.domain.Employee;

public class PayrollDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String msg) {
		System.out.println("PAYROLL department notified...");
		System.out.println(msg + employee.getName());
	}

}
