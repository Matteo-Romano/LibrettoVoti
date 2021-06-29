package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
//import java.util.List;

public class TestLibretto {
	
	public static void main(String[] args) {
		
		//PUNTO 1
		Libretto libretto = new Libretto();
		Voto voto1 = new Voto("Analisi 1", 20, LocalDate.of(2019, 2, 15));
		Voto voto2 = new Voto("Analisi 2", 25, LocalDate.of(2019, 3, 20));
		Voto voto3 = new Voto("Fisica 1", 21, LocalDate.of(2019, 4, 5));
		Voto voto4 = new Voto("Fisica 2", 27, LocalDate.of(2019, 11, 14));
		Voto voto5 = new Voto("Chimica", 29, LocalDate.of(2019, 9, 11));
		Voto voto6 = new Voto("Algebra", 25, LocalDate.of(2019, 10, 30));
		Voto voto7 = new Voto("Sistemi", 25, LocalDate.of(2010, 02, 4));
		Voto voto8 = new Voto("Statistica", 18, LocalDate.of(2020, 04, 9));
		Voto voto9 = new Voto("Database", 22, LocalDate.of(2021, 10, 27));
		Voto voto10 = new Voto("Cripto", 30, LocalDate.of(2021, 01, 12));
		
		libretto.add(voto1);//metodo add non esiste: creiamolo in Libretto
		libretto.add(voto2);
		libretto.add(voto3);
		libretto.add(voto4);
		libretto.add(voto5);
		libretto.add(voto6);
		libretto.add(voto7);
		libretto.add(voto8);
		libretto.add(voto9);
		libretto.add(voto10);
		
		System.out.println(libretto);
		
//		 PUNTO 2
		
		//Proviamo a stampare la lista, ma poco funzionale
		//List<Voto> venticinque = libretto.listaVotiUguali(25);
		//System.out.println(venticinque);
		
		Libretto venticinque = libretto.librettoVotiUguali(25);
		System.out.println(venticinque);
	}
}