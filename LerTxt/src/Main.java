// Importacoes da JRE
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.tt"))){ //O try vai tentar ler o arquivo por meio do BufferedReader
			String line; // foi definida para receber uma linha no arquivo txt
			String string = ""; // vai receber o conteudo da line dar um \n para separar o conteudo e nao misturar tudo
			
			while((line = reader.readLine()) != null)  { // While: ele vai procurar a linha certa procurando linha por linha
				string += line + "\n";
			}
			System.out.println(string); // Mostra na tela o resultado obtido
				
			}
		String teste = "Mouse: funciona= sim, qtdBotoes= 2, tamanho = pequeno\n "; // String que recebe os atributos do Mouse
		
		Mouse mouse = new Mouse(teste); // instanciando mouse que vai receber como parametro a variavel teste que criamos
		
		System.out.println(mouse); // moatra na tela o resultado dos algaritmos de acima
		}
		
		

	}


