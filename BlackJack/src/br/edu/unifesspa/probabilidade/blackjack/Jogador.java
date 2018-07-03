package br.edu.unifesspa.probabilidade.blackjack;

import java.util.ArrayList;

public class Jogador {
	private int pontos;
	private double chanceDe21;
	private double chanceDeVencer;
	private ArrayList<Carta> cartas;
	
	public Jogador() {
		cartas = new ArrayList<Carta>();
	}
	
	public boolean compraCarta(Carta carta) {
		for(Carta c : this.cartas) {
			if(c.getValor() == carta.getValor()) {
				c.addValor();
				return true;
			}
		}
		this.cartas.add(carta);
		this.pontos += carta.getValor();
		
		return true;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
}
