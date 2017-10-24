package edu.bsu.cs.hergin.cs691.samples.observer.before;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.setValue(5);
		
		System.out.println("NEW");
		
		subject.setValue(10);
	}

}
