package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//Classi come questa vengono chiamate POJO - Plain Old Java Object oppure Java Bean(s)
//Ovvero è un semplice contenitore di dati

/**
 * Memorizza il risultato di un esame singolo
 * @author matte
 *
 */
public class Voto {
	
	private String nome;
	private int voto;//30 e lode come lo rappresento?
	private LocalDate data; //data superamento
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame: " + nome + ", voto:" + voto + ", data:" + data;
	}
	
	
	
}
