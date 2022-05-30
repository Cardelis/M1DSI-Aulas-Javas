
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Importando a classe Scanner para receber informação do usuário

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		
		List<Usuario> listaDeUsuario = new ArrayList<Usuario>();

		for (int x = 1; x <= 4; x++) {

			Usuario usuario = new Usuario(); // Instanciar e criar um objeto usuario:
			usuario.endereco = new Endereco();
			
			Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner:

			System.out.println("Digite o nome do usuário " + x); // imprimir informação na tela

			usuario.setNome(scanner.next()) ;

			System.out.println("Digite a idade:"); // imprimir informação na tela

			usuario.idade = scanner.nextInt();
			
			
		    System.out.println("Digite O SEXO: F para feminino e M para masculino:"); // imprimir informação na tela
		    Sexo sexo = null;
			usuario.setSexo(sexo.valueOf( scanner.next()));
			
			System.out.println("Digite a rua:"); // imprimir informação na tela

			usuario.endereco.rua = scanner.next();

			System.out.println("Digite o número da casa:"); // imprimir informação na tela

			usuario.endereco.numero = scanner.nextInt();

			System.out.println("Digite o bairro:"); // imprimir informação na tela

			usuario.endereco.bairro = scanner.next();
			
			listaDeUsuario.add(usuario);

		}
		// PARA GRAVAR NO ESCREVER TXT
					try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) { //
						for (Usuario Usuario : listaDeUsuario)

							escrever.write(Usuario.toString()+"\n"); // to string e o metodo que a gente usa para poder subcrever

					}

		for (Usuario usuario : listaDeUsuario) {
			System.out.println(usuario);
	


			
			// CRIE LISTA DE MOUSES ESCRITOS
			List<Usuario> listaDeUsuarioLidos = new ArrayList<Usuario>();

			try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
				String line;

				while ((line = reader.readLine()) != null) { // While: ele vai procurar a linha certa procurando linha por
																// linha
					Usuario usuario4 = new Usuario();// CADA VEZ QUE DE (NEW) ELE TRNSFORMAREM EM VAI CRIAR UM OBJETO
					listaDeUsuarioLidos.add(usuario4);// GRAVAR NO NOVO LIT
				}

			}
	// PEGA A LISTA DE MOUSES LIDOS E MOSTRA NA TELA
			for (Usuario usuarioLidos : listaDeUsuarioLidos)
				System.out.println(usuarioLidos.toString());// to string e o metodo que a gente usa para poder subcrever

		}

		}
	}



	
