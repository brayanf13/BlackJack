package br.edu.unifesspa.probabilidade.blackjack;

public class BlackJack {
	private int cartasRestantes;
	private Baralho baralho;
	private Jogador mesa;
	private Jogador jogador;
	
	public BlackJack() {
		this.baralho = new Baralho();
		this.cartasRestantes = 52;
	}
	
	public void iniciar(String maoMesa, String maoJogador) {
		String[] cartasMesa = maoMesa.split(" ");
		String[] cartasJogador = maoJogador.split(" ");
		
		for(String str : cartasMesa)
			this.mesa.compraCarta(this.removerCarta(str));
		for(String str : cartasJogador)
			this.jogador.compraCarta(this.removerCarta(str));
		
		this.cartasRestantes -= 5;
	}
	
	public Carta removerCarta(String valor) {
		if (valor.toUpperCase() == "J" || valor.toUpperCase() == "Q" || valor.toUpperCase() == "K")
			valor = "10";
		else if(valor.toUpperCase() == "A")
			valor = "1";
			
		for (Carta carta : this.baralho.getCartas()) {
			if(carta.getValor() == Integer.parseInt(valor)) {
				this.cartasRestantes--;
				return carta.tiraUm();
			}
		}
		return null;
	}
	
	public double calcularChanceDeVencer() {
		int diferenca = this.mesa.getPontos() - this.jogador.getPontos();
		int favoravel = 0;
		
		if(diferenca < 0)
			return 0;
		
		for (Carta cartas : this.baralho.getCartas()) {
			if(cartas.getValor() > diferenca)
				favoravel += cartas.getQuantidade();
		}
		
		return favoravel / this.cartasRestantes;
	}
}
