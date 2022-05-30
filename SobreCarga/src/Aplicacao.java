import java.util.Scanner; // Importacoes da JRE

public class Aplicacao { // Classe publica aplicacao

	public static void main(String[] args) { // metodo main para permitir a execucao do programado programa
		
		Scanner scanner = new Scanner(System.in); // classe entanciando objeto, ela permite receber informacao do usuario
		

		Matematica matematica = new Matematica();// instanciando objeto da classe
		
		
	
		System.out.println("Somar dois numeros");// Mostra informacao na tela
		System.out.println("Digite o Primeiro numero");// Mostra informacao na tela
		int x = scanner.nextInt(); // Guarda informacao digitada pelo usuario na variavel
		
		System.out.println("Digite o segundo numero");// Mostra informacao na tela
		int y = scanner.nextInt(); // Guarda informacao digitada pelo usuario na variavel
	

		int soma = matematica.somar(x, y); // Guarda o resutado de MATEMATICA.SOMAR e guarda dentro da variavel

		System.out.println("o resultado é " + soma + "!!!");// Mostra informacao na tela

		soma = matematica.somar(x, y, 5); // Guarda o resultado de MATEMATICA.SOMAR dentro de SOMA
		System.out.println("o resultado é " + soma + "!!!");// Mostra informacao na tela
		
		
		double soma2 = matematica.somar(x, y);// Guarda o resultado de MATEMATICA.SOMAR dentro da variavel
		System.out.println("o resultado é " + soma2 + "!!!");// Mostra informacao na tela
	}

}
