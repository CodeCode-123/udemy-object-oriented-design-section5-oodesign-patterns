package object_oriented_design_patterns.observer_pattern.observers;

import object_oriented_design_patterns.observer_pattern.domain.Employee;

public interface IObserver {
	void callMe(Employee employee, String msg);
}
