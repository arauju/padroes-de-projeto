package padroes.exercicio.q5;

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
	
	private static final Biblioteca INSTANCE = new Biblioteca();
	
	private ArrayList<Livro> acervo; 
	private HashMap<Livro, Aluno> emprestimos;
	
	private Biblioteca() {
		this.acervo = new ArrayList<Livro>(); 
		emprestimos = new HashMap<Livro, Aluno>();
	}
	
	public static Biblioteca getInstance() {
		return INSTANCE;
	}
	
	public void cadastrarLivro(Livro livro) {
		acervo.add(livro);
	}
	
	public void emprestarLivro(int registro, Aluno aluno) {
		for (Livro livro : acervo) 
			if (livro.getRegistro() == registro && livro.isDisponivel()) {
				livro.setDisponivel(false);
				emprestimos.put(livro, aluno);	
			}
	}
	
	public void devolverLivro(int registro) {
		for (Livro livro : emprestimos.keySet()) 
			if (livro.getRegistro() == registro) {
				livro.setDisponivel(true);
				emprestimos.remove(livro);
			}
	}
	
	public void reservarLivro(int registro, Aluno aluno) {
		for (Livro livro : acervo) {
			if (livro.getRegistro() == registro)
				livro.addObserver(aluno);
		}
	}

}
