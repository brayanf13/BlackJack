package br.edu.unifesspa.probabilidade.blackjack;

public class Carta {
	private TiposCarta tipo;
	private int quantidade;
	
	public Carta(TiposCarta tipo) {
		super();
		this.tipo = tipo;
		this.quantidade = 4;
	}
	
	public boolean isVazio() {
		return (quantidade <= 0);
	}
	
}
