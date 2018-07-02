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

		baralho.add(new Carta(TiposCarta.catarA));
		baralho.add(new Carta(TiposCarta.catar2));
		baralho.add(new Carta(TiposCarta.catar3));
		baralho.add(new Carta(TiposCarta.catar4));
		baralho.add(new Carta(TiposCarta.catar5));
		baralho.add(new Carta(TiposCarta.catar6));
		baralho.add(new Carta(TiposCarta.catar7));
		baralho.add(new Carta(TiposCarta.catar8));
		baralho.add(new Carta(TiposCarta.catar9));
		baralho.add(new Carta(TiposCarta.catar10));
		baralho.add(new Carta(TiposCarta.catarJ));
		baralho.add(new Carta(TiposCarta.catarQ));
		baralho.add(new Carta(TiposCarta.catarK));
		 
		return baralho;
	}
	
}
