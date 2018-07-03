package br.edu.unifesspa.probabilidade.blackjack;

import java.util.ArrayList;

public class Baralho {
	private ArrayList<Carta> baralho;
	private int total;
	
	
	
	public Baralho() {
		super();
		this.baralho = inicializa();
		this.total = baralho.size() * 4;
	}



	public ArrayList<Carta> inicializa(){
		ArrayList<Carta> baralho = new ArrayList<Carta>();
		
		

		baralho.add(new Carta(TiposCarta.cartaA));
		baralho.add(new Carta(TiposCarta.carta2));
		baralho.add(new Carta(TiposCarta.carta3));
		baralho.add(new Carta(TiposCarta.carta4));
		baralho.add(new Carta(TiposCarta.carta5));
		baralho.add(new Carta(TiposCarta.carta6));
		baralho.add(new Carta(TiposCarta.carta7));
		baralho.add(new Carta(TiposCarta.carta8));
		baralho.add(new Carta(TiposCarta.carta9));
		baralho.add(new Carta(TiposCarta.carta10));
		baralho.add(new Carta(TiposCarta.cartaJ));
		baralho.add(new Carta(TiposCarta.cartaQ));
		baralho.add(new Carta(TiposCarta.cartaK));
		 
		return baralho;
	}
	
}
