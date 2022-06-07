import java.util.Scanner; // Importacoes da JRE

public class Aplicacao { // Classe publica aplicacao

	public static void main(String[] args) { // metodo main para permitir a execucao do programado programa
		
		Scanner scanner = new Scanner(System.in); // instanciando variavel do tipo scanner, ela permite receber informacao do usuario
		

		Matematica matematica = new Matematica();// instanciando a variavel matematica do tipo Matematica para poder ter acesso ao metodos da classe Matematica
		
		
	
		System.out.println("Somar dois numeros");// Mostra informacao na tela
		System.out.println("Digite o Primeiro numero");// Mostra informacao na tela
		int x = scanner.nextInt(); // nextInt() e do metodo Scanner e permite que o usuario digite um valor e ele interprete como int
		
		System.out.println("Digite o segundo numero");// Mostra informacao na tela
		int y = scanner.nextInt(); // nextInt() e do metodo Scanner e permite que o usuario digite um valor e ele interprete como int
	

		int soma = matematica.somar(x, y);0,

		System.out.println("o resultado é " + soma + "!!!");// Mostra informacao na tela

		soma = matematica.somar(x, y, 5); // Guarda o resultado de MATEMATICA.SOMAR dentro de SOMA
		System.out.println("o resultado é " + soma + "!!!");// Mostra informacao na tela
		
		
		double soma2 = matematica.somar(x, y); // chamando os metodos da classe Matematica
		System.out.println("o resultado é " + soma2 + "!!!");// Mostra informacao na tela
	}

}
