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
		
		int nPromossi = 0;
		int nBocciati = 0;
		
		for (int i = 0; i < arrayStudenti.length; i++) {
			
			if(arrayStudenti[i].getStatus() == "Promosso") {
				nPromossi++;
			}else {
				nBocciati++;
			}
		}
		
		System.out.println("nPromossi: " + nPromossi);
		System.out.println("nBocciati: " + nBocciati);
		
		
		//BONUS N PROMOSSI
		
		Studente[] arrayPromossi = new Studente[nPromossi];
		Studente[] arrayBocciati = new Studente[nBocciati];
		
		for (int i = 0; i < arrayStudenti.length; i++) {
			
			int p = 0;
			int b = 0;
			
			if(arrayStudenti[i].getStatus() == "Promosso") {
				arrayPromossi[p] = arrayStudenti[i];
				p++;
			}else {
				arrayBocciati[b] = arrayStudenti[i];
				b++;
			}
		}
		//BONUS N PROMOSSI
		
	}
	
}
