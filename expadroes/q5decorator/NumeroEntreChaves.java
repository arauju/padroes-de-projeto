package ex5decorator;

public class NumeroEntreChaves extends NumeroDecorator {

	public NumeroEntreChaves(Numero numero) {
		super(numero);
	}
	
	public void imprimir() {
		System.out.print("{");
		numero.imprimir();
		System.out.print("}");
	}
	
}
