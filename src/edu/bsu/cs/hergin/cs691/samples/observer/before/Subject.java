package edu.bsu.cs.hergin.cs691.samples.observer.before;

public class Subject {
	int m_value;
	DivObserver divObserver;
	ModObserver modObserver;
	
	public Subject() {
		divObserver = new DivObserver(4);
		modObserver = new ModObserver(3);
	}
	
	public void setValue(int value) {
		m_value = value;
		Notify();
	}
	
	void Notify() {
		divObserver.update(m_value);
		modObserver.update(m_value);
	}
}
