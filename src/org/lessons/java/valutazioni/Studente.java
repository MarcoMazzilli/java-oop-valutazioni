package org.lessons.java.valutazioni;

public class Studente {

	public int id;
	public int percentualeAssenze;
	public float mediaVoti;
	
	Studente(int id , int percentualeAssenze, float mediaVoti){
		this.id = id;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	

	public String getStatus() {
		boolean promosso = false;
		
		if(percentualeAssenze >= 25 && percentualeAssenze <= 50 && mediaVoti > 2) {
			promosso = true;
		}
		
		if(percentualeAssenze < 25 && mediaVoti >= 2) {
			promosso = true;
		}
		
		if(percentualeAssenze > 50) {
			promosso = false;
		}
		
		return promosso? "Promosso":"Bocciato";
	}
	
	public void getInfoStudent() {
		System.out.println("ID Studente: "+ this.id);
		System.out.println("Media voti: " + String.format("%.2f", this.mediaVoti));
		System.out.println("Percentuale assenze: " + this.percentualeAssenze + "%");
		System.out.println("Stato studente: " + this.getStatus());
		System.out.println("-------------");
	}
	
}
