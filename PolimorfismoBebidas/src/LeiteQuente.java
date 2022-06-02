
public class LeiteQuente extends Bebida {  // Subclasse Leite quente herdando os atributos da Superclasse Bebida

	public LeiteQuente() {

		super("Leite Quente", true);

	}

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public void preparar() { // metodo preparar
		super.preparar();
		System.out.println("Colocando o leite no copo"); // Mostra na tela

	}

}
