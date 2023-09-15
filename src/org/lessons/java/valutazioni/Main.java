package org.lessons.java.valutazioni;

public class Main {

	public static void main(String[] args) {
		
		Studente student1 = new Studente();
		
		if(student1.getStatus()) {
			System.out.println("promosso");
		}else {
			System.out.println("Bocciato");
		}
	}
	
}
