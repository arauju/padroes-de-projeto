package padroes.exercicio.q4;

public class Main {
	
	public static void main(String[] args) {
		
		Visualizador visualizador = new VisualizadorBMP();
		visualizador.visualizar();
		
		visualizador = new VisualizadorJPG();
		visualizador.visualizar();
		
	}

}
