package padroes.exercicio.q7;

public class AtacarSozinho implements Estrategia {

	@Override
	public void acaoInicial() {
		System.out.println("Aproximar furtivamente.");
	}

	@Override
	public void acaoFinal() {
		System.out.println("Atacar.");
		System.out.println("Pular nas costas");
		System.out.println("Morder pescoço.");
	}

}
