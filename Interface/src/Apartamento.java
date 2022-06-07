
public class Apartamento implements ItemCaro { // A classe apartamento faz parte de item caro 
	
	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	
	public double getPreco() { // Metodo herdado 
		
		return 250000; // Mas possui seu valor especifico

	}
	
	

}
