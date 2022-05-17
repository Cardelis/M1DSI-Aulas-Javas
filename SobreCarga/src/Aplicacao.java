import java.util.Scanner; // Invocaçao de scanner

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		Matematica matematica = new Matematica();
		
		
	
		System.out.println("Somar dois numeros");// Mostra informaçao na tela
		System.out.println("Digite o Primeiro numero");// Mostra informaçao na tela
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");// Mostra informaçao na tela
		int y = scanner.nextInt();
	

		int soma = matematica.somar(x, y);

		System.out.println("o resultado é " + soma + "!!!");// Mostra informaçao na tela

		soma = matematica.somar(x, y, 5);
		System.out.println("o resultado é " + soma + "!!!");// Mostra informaçao na tela
		
		
		double soma2 = matematica.somar(x, y);
		System.out.println("o resultado é " + soma2 + "!!!");// Mostra informaçao na tela
	}

}
