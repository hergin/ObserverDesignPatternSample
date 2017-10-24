package edu.bsu.cs.hergin.cs691.samples.observer.after;

public class DivObserver implements Observer {
	int m_div;

	public DivObserver(Subject subject, int div) {
		subject.attach(this);
		m_div = div;
	}

	@Override
	public void update(int value) {
		System.out.println(value + " / " + m_div + " = " + (value / m_div));
	}
}
