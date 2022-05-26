import java.util.Scanner; // Invocacao de scanner

public class Aplicacao { // Classe publica aplicacao

	public static void main(String[] args) { // metodo main para permitir a execucao do programado programa
		
		Scanner scanner = new Scanner(System.in); // 
		

		Matematica matematica = new Matematica();// instanciando objeto da classe
		
		
	
		System.out.println("Somar dois numeros");// Mostra informacao na tela
		System.out.println("Digite o Primeiro numero");// Mostra informacao na tela
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");// Mostra informacao na tela
		int y = scanner.nextInt();
	

		int soma = matematica.somar(x, y);

		System.out.println("o resultado é " + soma + "!!!");// Mostra informacao na tela

		soma = matematica.somar(x, y, 5);
		System.out.println("o resultado é " + soma + "!!!");// Mostra informacao na tela
		
		
		double soma2 = matematica.somar(x, y);
		System.out.println("o resultado é " + soma2 + "!!!");// Mostra informacao na tela
	}

}
