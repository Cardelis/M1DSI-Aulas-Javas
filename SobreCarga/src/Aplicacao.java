import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		Matematica matematica = new Matematica();
		
		
	
		System.out.println("Somar dois numeros");
		System.out.println("Digite o Primeiro numero");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");
		int y = scanner.nextInt();
	

		int soma = matematica.somar(x, y);

		System.out.println("o resultado é " + soma + "!!!");

		soma = matematica.somar(x, y, 5);
		System.out.println("o resultado é " + soma + "!!!");
		
		
		double soma2 = matematica.somar(x, y);
		System.out.println("o resultado é " + soma2 + "!!!");
	}

}
