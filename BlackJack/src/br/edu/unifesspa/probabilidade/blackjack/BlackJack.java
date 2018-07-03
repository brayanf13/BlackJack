package br.edu.unifesspa.probabilidade.blackjack;

public class BlackJack {
	private int cartasRestantes;
	private Baralho baralho;
	private Jogador mesa;
	private Jogador jogador;
	
	public BlackJack() {
		this.baralho = new Baralho();
	}
	
	public void iniciar(String maoMesa, String maoJogador) {
		String[] cartasMesa = maoMesa.split(" ");
		String[] cartasJogador = maoJogador.split(" ");
		
		for(String str : cartasMesa)
			this.mesa.compraCarta(baralho.removerCarta(str));
		for(String str : cartasJogador)
			this.jogador.compraCarta(baralho.removerCarta(str));
		
	}
	
	public double calcularChanceDeVencer() {
		int diferenca = this.mesa.getPontos() - this.jogador.getPontos();
		int favoravel = 0;
		
		for (Carta cartas : this.baralho.getCartas()) {
			if(diferenca >= cartas.getValor())
				favoravel += cartas.getQuantidade();
		}
		
		return favoravel / this.cartasRestantes;
	}
}
