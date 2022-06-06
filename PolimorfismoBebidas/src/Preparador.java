
public class Preparador {

	public void prepararBebida(Bebida bebida) { // criando metodo preparar bebida

		System.out.println("Preparando a Bebiada" + bebida.getNome()); // Mostra na tela
		

		bebida.preparar(); // esta chamando o metodo preparar

		if (bebida.isAquecer()) {  // teste condional
			System.out.println("Aquecendo a bebida" + bebida.getNome()); // Mostra na tela
		}
		
        
		System.out.println("Bebida preparada com sucesso!!\n"); // Mostra na tela
	}

}
