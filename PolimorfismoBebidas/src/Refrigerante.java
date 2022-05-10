
public class Refrigerante extends Bebida {

	public Refrigerante() {
		
		super("Refrigerante", false); // super chama o construtor  da superclasse
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando Refrigerante");
	}
	
}

