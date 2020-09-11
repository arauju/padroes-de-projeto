package padroes.exercicio.q5;

public class SistemaBiblioteca {

	public static void main(String[] args) {

		Biblioteca biblioteca = Biblioteca.getInstance();
		
		biblioteca.cadastrarLivro(new Livro(111, "PROGRAMANDO EM JAVA"));
		biblioteca.cadastrarLivro(new Livro(222, "BANCO DE DADOS"));
		biblioteca.cadastrarLivro(new Livro(333, "ESTRUTURAS DE DADOS EM JAVA"));
		
		Aluno joao = new Aluno ("JOAO", 1234);
		biblioteca.emprestarLivro(111, joao);
		
		Aluno maria = new Aluno ("MARIA", 9876);
		biblioteca.reservarLivro(111, maria);
		
		Aluno jose = new Aluno ("JOSE", 9666);
		biblioteca.reservarLivro(111, jose);
		
		biblioteca.devolverLivro(111);
	}

}
