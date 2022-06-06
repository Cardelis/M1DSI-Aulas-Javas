
public class Refrigerante extends Bebida {

	public Refrigerante() {
		
		super("Refrigerante", false); // super chama o construtor  da superclasse
		
	}

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public void preparar() {  // metodo preparar
		super.preparar(); //usado para chamar os métodos e variáveis da Superclasse
		System.out.println("Colocando gelo no copo"); // mostra informacao na tela
		System.out.println("Colocando Refrigerante"); // mostra informacao na tela
	}
	
}

