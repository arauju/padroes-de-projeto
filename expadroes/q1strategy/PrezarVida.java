package padroes.exercicio.q7;

public class PrezarVida implements Estrategia {

	@Override
	public void acaoInicial() {
		System.out.println("Rezar para não ter sido visto.");
	}

	@Override
	public void acaoFinal() {
		System.out.println("Fugir como se sua vida dependesse disso.");
	}

}
