package edu.bsu.cs.hergin.cs691.samples.observer.after;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		DivObserver divObserver = new DivObserver(subject, 3);
		ModObserver modObserver = new ModObserver(subject, 3);
		ModObserver modObserver3 = new ModObserver(subject, 3);
		ModObserver modObserver2 = new ModObserver(subject, 4);
		DivObserver divObserver2 = new DivObserver(subject, 10);
		NewObserver newObserver = new NewObserver(subject);
		
		subject.setValue(10);
	}

}
