package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

//Conterrà al suo interno dei voti

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
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
}
