package object_oriented_design_patterns.observer_pattern.domain;

import java.util.Date;

public class Employee {
	public int employeeID;
	private String name;
	private Date date;
	private int salary;
	private boolean working = false;
	private static int COUNTER;
	public Employee(String name, Date date, int salary, boolean working) {
		super();
		this.name = name;
		this.date = date;
		this.salary = salary;
		this.working = working;
		this.employeeID = ++COUNTER;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	public static int getCOUNTER() {
		return COUNTER;
	}
	public static void setCOUNTER(int cOUNTER) {
		COUNTER = cOUNTER;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", date=" + date + ", salary=" + salary
				+ ", working=" + working + "]";
	}
	
}
