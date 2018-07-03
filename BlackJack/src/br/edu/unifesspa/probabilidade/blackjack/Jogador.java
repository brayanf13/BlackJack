package br.edu.unifesspa.probabilidade.blackjack;

import java.util.ArrayList;

public class Jogador {
	private int pontos;
	private double chanceDe21;
	private double chanceDeVencer;
	private ArrayList<Carta> cartas;
	
	public Jogador(int pontos, double chanceDe21, double chanceDeVencer) {
		this.pontos = pontos;
		this.chanceDe21 = chanceDe21;
		this.chanceDeVencer = chanceDeVencer;
	}
}
