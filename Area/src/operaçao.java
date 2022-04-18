import java.util.Scanner;

public class operaçao {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		

		Matematica matematica = new Matematica();
		
		
	
		System.out.println("Somar dois numeros");
		
		System.out.println("Digite a Altura");
		int x = scanner.nextInt();
		
		System.out.println("Digite a Largura");
		int y = scanner.nextInt();
	

		
		

		int area = matematica.Calcular(x, y);
		System.out.println("o resultado é " + area + "!!!");
		

		area = matematica.Calcular(x, y);
		System.out.println("o resultado é " + area + "!!!");
		
		
		double area3 = matematica.Calcular(x, y);
		System.out.println("o resultado é " + area  + "!!!");
	}

}


