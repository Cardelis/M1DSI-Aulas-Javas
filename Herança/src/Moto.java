
public class Moto  extends Veiculo{ // Extendendo a classe com a superclasse
	
	public void empinar() { // Metodo empinar
		System.out.println("UUUHU"); // Mostra informacao na tela
	}

	@Override
	public void buzinar() { // Metodo herdado da superclasse
		System.out.println("ruuuuuuum ruuum"); // mostra informacao na tela
	}
	
	

}
