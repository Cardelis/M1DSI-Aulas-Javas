import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List lista = new ArrayList();

		for (int x = 1; x <= 4; x++) {
			Scanner scanner = new Scanner(System.in);

			Usuario usuario = new Usuario(null);

			System.out.println("Digite o nome " + x);
			String nome = scanner.next();

			System.out.println("Digite a Idade");
			int idade = scanner.nextInt();

			System.out.println("Digite a Rua");
			String rua = scanner.next();

			System.out.println("Digite o numero da casa");
			int numero = scanner.nextInt();

			System.out.println("Digite o bairro");
			String bairro = scanner.next();

			


			}
		}
	}

