// Importacoes da JRE
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List lista = new ArrayList(); // Criando uma lista

		lista.add("abc");
		lista.add(12);
		lista.add(true);

		for (int x = 0; x < lista.size(); x++) {
			System.out.println(lista.get(x));
		}
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
		System.out.println();
		lista.remove(0); // Remove e redimensiona a lista
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.add(0, "def"); // Empurra o valor que está na posição 0
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.set(0, "ghi"); // Coloca na posiçao e coloca o valor
		for (Object valor : lista) {
			System.out.println(valor);

		}
		System.out.println();

		lista.clear(); // Limpa a lista entera
		if (lista.isEmpty()) { // Vacia? retorna (True ou False)
			System.out.println("sua lista esta vazia");
		}

		Conta conta1 = new Conta("Agua", 60.00); // Intancia de objeto 
		Conta conta2 = new Conta("Luz", 150.00); // Intancia de objeto

		List<Conta> listaDeContas = new ArrayList<Conta>(); // instancia de uma lista do tipo Conta
		
		//  valores instanciados estao sendo jogadas na lista criada
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);

		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}
	}

}
