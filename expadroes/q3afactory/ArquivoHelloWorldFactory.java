package padroes.exercicio.q1;

public class ArquivoHelloWorldFactory extends HelloWorldFactory {

	@Override
	public FormatoSaida getFormatoSaida() {
		return new SaidaArquivo();
	}

}
