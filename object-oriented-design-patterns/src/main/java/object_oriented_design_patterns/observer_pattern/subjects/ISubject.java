package object_oriented_design_patterns.observer_pattern.subjects;

import object_oriented_design_patterns.observer_pattern.observers.IObserver;

public interface ISubject {
	void registerObserver(IObserver observer);
	void removeObserver(IObserver observer);
	void notifyObservers();
}
