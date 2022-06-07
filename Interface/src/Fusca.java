
public class Fusca implements Carro {

	// sobrescrita de metodos virarEsquerda, direira, acelerar e abrirPorta 
	@Override
	public void virarEsquerda() {
		System.out.println("Fusca virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Fusca virou a direita");
		
	}

	@Override
	public void acelera() {
		System.out.println("Fusca acelerou");
		
	}

	@Override
	public void AbrirPorta() {
		System.out.println("");
		
	}

	
}
