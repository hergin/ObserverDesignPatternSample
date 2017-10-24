package edu.bsu.cs.hergin.cs691.samples.observer.after;

public class ModObserver implements Observer {
	int m_mod;

	public ModObserver(Subject subject, int mod) {
		subject.attach(this);
		m_mod = mod;
	}

	@Override
	public void update(int value) {
		System.out.println(value + " % " + m_mod + " = " + (value % m_mod));
	}
}
