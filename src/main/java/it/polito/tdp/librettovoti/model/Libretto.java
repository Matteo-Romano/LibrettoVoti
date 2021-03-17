package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto () {
		this.voti = new ArrayList <>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	// Punto 2, stampa dei voti 25
	/* public void stampaVotiUguali(int punteggio) {
		// Il libretto stampa da solo i voti
		System.out.println();
	}
	// Oppure, un metodo più generale: restituiamo una stringa
	public String votiUguali (int punteggio) {
		//calcola una stringa che contiene i voti 
		//sarà poi il chiamante a stamparli
		//-> stampo solo il nome? oppure tutto il voto.toString()?
	}
	*/
	
	// Oppure ancora meglio: restituiamo una lista
	public List<Voto> listaVotiUguali2(int punteggio){
		// restituisce i voti uguali al criterio
		// però i voti sono dati e restituiti sotto forma di lista
		// se dovessi cambiare ciò una volta dovrei cambiare per tutti
		//1. Possiamo creare una nuova lista i cui inserire i voti uguali
		List<Voto> risultato = new ArrayList<>();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v); //v è uno stesso oggetto contenuto in due liste diverse
			}
		}
	return risultato;
	}
	
	//TO DO
	//oppure per una soluzione più completa
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for (Voto v: this.voti) {
			if (v.getVoto() == punteggio) {
				risultato.add(v); 
			}
		}
		return risultato;
	}
	
	public String toString() {
		String s = "";
		for (Voto v: this.voti) { //sintassi usata per reiterare sulle liste
		s = s + v.toString() + "\n";	
		}
		return s;
	}
}
