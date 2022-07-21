import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		  
		
		Scanner teclado = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Digite a temperatura em Celsius");
		calculadora.CE = (teclado.nextDouble());
		
		calculadora.converter();
	
	
	}

}
