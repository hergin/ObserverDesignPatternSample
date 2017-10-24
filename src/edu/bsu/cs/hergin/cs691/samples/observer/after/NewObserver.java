package edu.bsu.cs.hergin.cs691.samples.observer.after;

public class NewObserver implements Observer {

	public NewObserver(Subject subject) {
		subject.attach(this);
	}
	
	@Override
	public void update(int value) {
		System.out.println("New Value is "+value);
	}
	
}
