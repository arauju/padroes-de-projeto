package padroes.exercicio.q5;

import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {
	
	private String nome;
	private int ra;
	
	public Aluno(String nome, int ra) {
		this.nome = nome;
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.format("\n%s, o livro %s está disponível na biblioteca.", 
				nome, ((Livro)arg0).getTitulo());		
	}
	
}
