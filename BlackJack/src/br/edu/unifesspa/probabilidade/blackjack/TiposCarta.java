package br.edu.unifesspa.probabilidade.blackjack;

public enum TiposCarta {
	cartaA(1),carta2(2),carta3(3),carta4(4),carta5(5),carta6(6),carta7(7),carta8(8),
	carta9(9),carta10(10),cartaJ(10),cartaQ(10),cartaK(10);
	
	int valor;
	
	TiposCarta(int valor){
		this.valor = valor;
	}
}
