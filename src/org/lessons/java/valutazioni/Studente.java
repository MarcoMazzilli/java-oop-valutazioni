package org.lessons.java.valutazioni;

public class Studente {

	public int id;
	public int percentualeAssenze;
	public float mediaVoti;
	
//	Studente(int id){
//		this.id = id; 
//	}
	
	Studente(){
		this.id = 5; 
		this.percentualeAssenze = 24;
		this.mediaVoti = 2.5f;
	}
	

	public boolean getStatus() {
		boolean promosso = false;
		
		if(percentualeAssenze > 25 && percentualeAssenze < 50 && mediaVoti > 2) {
			promosso = true;
		}
		
		if(percentualeAssenze < 25 && mediaVoti >= 2) {
			promosso = true;
		}
		
		if(percentualeAssenze > 50) {
			promosso = false;
		}
		
		return promosso;
	}
	
}
