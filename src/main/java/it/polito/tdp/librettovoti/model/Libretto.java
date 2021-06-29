package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

//Conterrà al suo interno dei voti

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	//PUNTO 1
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		for (Voto v: voti) {
			s= s+ v.toString()+"\n";
		}
		return s;
	}
	
	//PUNTO 2
	//Proviamo prima a restituire una lista
	/*public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto> risultato = new ArrayList<>();
		for (Voto v: voti) {
			if (v.getVoto()==punteggio)
				risultato.add(v);//Lo stesso oggetto v è contenuto in due liste diverse
		}
		return risultato;
	}*/
	
	//Sarebbe meglio stampare un libretto con dentro tutti i voti con uno stesso punteggio 
	public Libretto librettoVotiUguali(int punteggio) {
		Libretto votiUguali = new Libretto();
		for (Voto v: voti) {
			if (v.getVoto()==punteggio)
				votiUguali.add(v);
		}
		return votiUguali;
	}
}
