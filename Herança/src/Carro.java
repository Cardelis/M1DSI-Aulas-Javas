
public class Carro extends Veiculo { // Classe cachorro extendendo a superclasse Animal
	
	private boolean quatroPortas; // criando variavel privada

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public void imprimir() {
		super.imprimir(); // super herda todo o codigo que esta dentro do metodo imprimir
		System.out.println("Tem 4 Portas:" + quatroPortas);
	}
	public boolean isQuatroPortas() {
		return quatroPortas;
	}
	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	
}
