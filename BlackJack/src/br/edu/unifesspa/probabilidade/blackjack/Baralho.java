package br.edu.unifesspa.probabilidade.blackjack;

import java.util.ArrayList;

public class Baralho {
	private ArrayList<Carta> cartas;
	private int total;
	
	public Baralho() {
		super();
		this.cartas = inicializa();
		this.total = cartas.size() * 4;
	}

	public ArrayList<Carta> inicializa(){
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		for(int i = 1; i <= 10; i++) {
			if(i == 10)
				cartas.add(new Carta(i, 16));
			else
				cartas.add(new Carta(i, 4));
		}
		return cartas;
	}
	
	public Carta removerCarta(String valor) {
		if (valor.toUpperCase() == "J" || valor.toUpperCase() == "Q" || valor.toUpperCase() == "K")
			valor = "10";
		else if(valor.toUpperCase() == "A")
			valor = "1";
			
		for (Carta carta : this.cartas) {
			if(carta.getValor() == Integer.parseInt(valor)) {
				return carta.tiraUm();
			}
		}
		return null;
	}
	
	public ArrayList<Carta> getCartas(){
		
		return this.cartas;
	}
	
}
