package padroes.exercicio.q4;

public abstract class Visualizador{
	
	public abstract Imagem getImagem();

    public void visualizar(){
	    Imagem img = getImagem();
	    img.carregar();
	    img.exibir();
	    img.fechar();
    }
    
}

