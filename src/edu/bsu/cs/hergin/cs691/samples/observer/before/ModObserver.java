package edu.bsu.cs.hergin.cs691.samples.observer.before;

public class ModObserver {
	int m_mod;

	public ModObserver(int mod) {
		m_mod = mod;
	}

	void update(int val) {
		System.out.println(val + " % " + m_mod + " = " + (val % m_mod));
	}
}
