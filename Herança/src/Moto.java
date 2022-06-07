
public class Moto  extends Veiculo{ // Extendendo a classe com a superclasse
	
	public void empinar() { // Metodo empinar
		System.out.println("UUUHU"); // Mostra informacao na tela
	}

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public void buzinar() { // Metodo herdado da superclasse
		System.out.println("PIPIPIPIPIIPIPIPPIIPIIPIP"); // mostra informacao na tela
	}
	
	

}
