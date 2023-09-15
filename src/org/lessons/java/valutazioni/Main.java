package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
				
		Studente[] arrayStudenti = new Studente[20];
		
		for (int i = 0; i < arrayStudenti.length; i++) {
			
			float mediaVoti = rnd.nextFloat(1,6);
			int percentualeAssenze = rnd.nextInt(0,100);
			
			arrayStudenti[i] = new Studente(i,percentualeAssenze,mediaVoti);
			
			arrayStudenti[i].getInfoStudent();
		}
	}
	
}
