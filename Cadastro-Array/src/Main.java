import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		List<Usuario> listaDeUsuario = new ArrayList<Usuario>();
		Scanner scanner = new Scanner(System.in);

		for (int x = 1; x <= 4; x++) {

			Usuario usuario = new Usuario();
			usuario.setEndereco(new Endereco());

			System.out.println("Digite o nome " + x);
			usuario.setNome(scanner.next());

			System.out.println("Digite a Idade");
			usuario.setIdade(scanner.nextInt());

			System.out.println("sexo");
			System.out.println("masculino = 1  ou fmenino = 2");
			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				opcao = scanner.nextInt();
				if (opcao == 2)
					usuario.setSexo(Sexo.F);

				else if (opcao == 1)
					usuario.setSexo(Sexo.M);
				else {
					System.out.println("errado");
					System.out.println("masculino = 1 ou femenino = 2");
				}

			}

			System.out.println("Digite a Rua");
			usuario.getEndereco().setRua(scanner.next());

			System.out.println("Digite o numero da casa");
			usuario.getEndereco().setNumero(scanner.nextInt());

			System.out.println("Digite o bairro");
			usuario.getEndereco().setBairro(scanner.next());
			
			listaDeUsuario.add(usuario);
			
		}
		// PARA GRAVAR NO ESCREVER TXT
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) { //
			for (Usuario Usuario : listaDeUsuario)

				escrever.write(Usuario.toString() + "\n"); // to string e o metodo que a gente usa para poder subcrever

		}

		for (Usuario usuario : listaDeUsuario) {
			System.out.println(usuario);

           // CRIE LISTA DE CADASTROS ESCRITOS
			List<Usuario> listaDeUsuarioLidos = new ArrayList<Usuario>();

			try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
				String line;

				while ((line = reader.readLine()) != null) { // While: ele vai procurar a linha certa procurando linha
																// por
																// linha
					Usuario usuario1 = new Usuario(line);// CADA VEZ QUE DE (NEW) ELE TRNSFORMAREM EM VAI CRIAR UM OBJETO
					
					listaDeUsuarioLidos.add(usuario1);// GRAVAR NO NOVO LIT
				}

			}
           // PEGA A LISTA DE CADASTROS LIDOS E MOSTRA NA TELA
			for (Usuario usuarioLidos : listaDeUsuarioLidos)
				System.out.println(usuarioLidos.toString());// to string e o metodo que a gente usa para poder subcrever
			
			
		}

	}
}
