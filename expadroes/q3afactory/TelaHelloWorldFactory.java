package padroes.exercicio.q1;

public class TelaHelloWorldFactory extends HelloWorldFactory {

	@Override
	public FormatoSaida getFormatoSaida() {
		return new SaidaTela();
	}

}
