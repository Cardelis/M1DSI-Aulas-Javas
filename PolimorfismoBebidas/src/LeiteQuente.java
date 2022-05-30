
public class LeiteQuente extends Bebida {  // Subclasse Leite quente herdando os atributos da Superclasse Bebida

	public LeiteQuente() {

		super("Leite Quente", true);

	}

	@Override 
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo"); // Mostra na tela

	}

}
