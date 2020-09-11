package padroes.exercicio.q7;

public class AtacarEmBando implements Estrategia {

	@Override
	public void acaoInicial() {
		System.out.println("Formar bando com outros leopardos");
		System.out.println("Separar um bisão da manada");
	}

	@Override
	public void acaoFinal() {
		System.out.println("Atacar em conjunto.");
		System.out.println("Derrubar bisão.");
		System.out.println("Morder o pescoço.");
	}

}
