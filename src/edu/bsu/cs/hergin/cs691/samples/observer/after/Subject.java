package edu.bsu.cs.hergin.cs691.samples.observer.after;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	int m_value;
	List<Observer> observers;

	public Subject() {
		observers = new ArrayList<>();
	}

	public void attach(Observer o) {
		observers.add(o);
	}

	public void setValue(int value) {
		m_value = value;
		Notify();
	}

	void Notify() {
		for (Observer observer : observers) {
			observer.update(m_value);
		}
	}
}
