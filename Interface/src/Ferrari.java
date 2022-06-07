
public class Ferrari implements Automovel, ItemCaro { // extendendo duas interfaces, pois a classe Ferrari possui metodos que serao usados das duas classes

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");

	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");

	}

	@Override
	public void acelera() {
		System.out.println("Ferrari acelerou");

	}

	@Override // Aqui o metodo getPreco da classe ItemCaro foi sobrescrito
	public double getPreco() {
		return 250000;
	}

}
