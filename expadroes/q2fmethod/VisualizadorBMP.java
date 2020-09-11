package padroes.exercicio.q4;

public class VisualizadorBMP extends Visualizador {

	@Override
	public Imagem getImagem() {
		return new ImagemBMP();
	}
	
}
