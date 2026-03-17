package object_oriented_design_patterns.observer_pattern.clients;

import java.util.Date;

import object_oriented_design_patterns.observer_pattern.domain.Employee;
import object_oriented_design_patterns.observer_pattern.observers.HRDepartment;
import object_oriented_design_patterns.observer_pattern.observers.IObserver;
import object_oriented_design_patterns.observer_pattern.observers.PayrollDepartment;
import object_oriented_design_patterns.observer_pattern.subjects.EmployeeManagementSystem;

public class App {
	public static void main(String[] args) {
		// Initialize observers
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		// register these observers
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		// Hire new employee notification
		Employee bob = new Employee("Bob", new Date(), 35000, true);
		ems.hireNewEmployee(bob);
		System.out.println();
		// modify employee name notification
		ems.modifyEmployeeName(5, "Imtiaz");
	}
}
