package edu.bsu.cs.hergin.cs691.samples.observer.before;

public class DivObserver {
	int m_div;

	public DivObserver(int div) {
		m_div = div;
	}

	void update(int val) {
		System.out.println(val + " / " + m_div + " = " + (val / m_div));
	}
}
