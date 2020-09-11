package ex5decorator;

public abstract class NumeroDecorator extends Numero {
	
  protected Numero numero;
  
  public NumeroDecorator(Numero numero) {
	  this.numero = numero;
  }
  
}
