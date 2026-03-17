package object_oriented_design_patterns.observer_pattern.subjects;

import java.util.ArrayList;
import java.util.List;

import object_oriented_design_patterns.observer_pattern.domain.Employee;
import object_oriented_design_patterns.observer_pattern.domain.EmployeeDAO;
import object_oriented_design_patterns.observer_pattern.observers.IObserver;

public class EmployeeManagementSystem implements ISubject {
	private Employee employee;
	private String msg;
	private EmployeeDAO employeeDAO;
	private List<IObserver> observerList;
	private List<Employee> employees;
	public EmployeeManagementSystem() {
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();	
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		if (observerList == null) {
			observerList = new ArrayList<>();
		}
		observerList.add(observer);
	}
	public void hireNewEmployee(Employee newEmployee) {
		employees.add(newEmployee);
		msg = "New Hire: ";
		employee = newEmployee;
		notifyObservers();
	}
	public void modifyEmployeeName(int employeeId, String newName) {
		employee = null;
		msg = "Name Changed: ";
		for (Employee emp: employees) {
			if (emp.getEmployeeID() == employeeId) {
				emp.setName(newName);
				employee = emp;
				break;
			}
		}
		if (employee != null) {
			notifyObservers();
		}
	}
	@Override
	public void removeObserver(IObserver observer) {
		if (observerList != null && observerList.contains(observer)) {
			observerList.remove(observer);
		}
	}
	@Override
	public void notifyObservers() {
		for (IObserver department: observerList) {
			department.callMe(employee, msg);
		}
	}
}
