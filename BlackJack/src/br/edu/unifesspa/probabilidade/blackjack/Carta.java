package br.edu.unifesspa.probabilidade.blackjack;

public class Carta {
	private int valor;
	private int quantidade;
	
	public Carta(int valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public boolean isVazio() {
		return (quantidade == 0);
	}

	public int getValor() {
		return this.valor;
	}
	
	public Carta tiraUm() {
		this.valor--;
		return new Carta(this.valor, 1);
	}
}
