
public class Cachorro  extends Animal { //Classe cachorro extendendo a superclasse Animal

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public void Falar() { // metodo falar 
		System.out.println("GUAUUUUUU"); // Mostra informacao na tela
	}
	public void Morder() { // mwtodo morder
		System.out.println("Miaaaaki"); // mostra informacao na tela
	}
	

}
