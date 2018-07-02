package br.edu.unifesspa.probabilidade.blackjack;

public enum TiposCarta {
	catarA(1),catar2(2),catar3(3),catar4(4),catar5(5),catar6(6),catar7(7),catar8(8),
	catar9(9),catar10(10),catarJ(10),catarQ(10),catarK(10);
	
	int valor;
	
	TiposCarta(int valor){
		this.valor = valor;
	}
}
