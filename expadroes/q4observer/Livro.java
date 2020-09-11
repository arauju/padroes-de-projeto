package padroes.exercicio.q5;

import java.util.Observable;

public class Livro extends Observable {
	
	private int registro;
	private String titulo;
	private boolean disponivel;

	public Livro(int registro, String titulo) {
		this.registro = registro;
		this.titulo = titulo;
		this.disponivel = true;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		if (disponivel) {
			setChanged();
			notifyObservers();
		}
	}

}
