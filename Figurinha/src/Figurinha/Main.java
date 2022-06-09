package Figurinha;

public class Main {

	public static void main(String[] args) {

		// Prentendo perfil da Cardelis
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Cardelis";
		pessoa1.numFigurinhas = 20;
		pessoa1.x = 1;
		System.out.println("Número de figurinhas iniciais da Cardelis: " + pessoa1.numFigurinhas);

		// Prentendo perfil do Jonathan
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Jonathan";
		pessoa2.numFigurinhas = 20;
		System.out.println("Número de figurinhas iniciais do Jonathan: " + pessoa2.numFigurinhas + "\n");

		// Realizando a troca
		pessoa1.Dar(35, pessoa2);

		// Resultado final
		// Teste condicional para exibir a mensagem do resultado apenas se a variavel (x) for igual a (1) conforme indicado na Classe Pessoa
		if (pessoa1.x > 1) {
			System.out.println("");
		} else {
			System.out.println("Número de figurinhas do Pedro depois da troca: " + pessoa1.numFigurinhas);
			System.out.println("Número de figurinhas do Jorge depois da troca: " + pessoa2.numFigurinhas);
		}
	}
}
