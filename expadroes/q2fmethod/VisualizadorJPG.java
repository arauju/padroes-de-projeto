package padroes.exercicio.q4;

public class VisualizadorJPG extends Visualizador {

	@Override
	public Imagem getImagem() {
		return new ImagemJPG();
	}
	
}
