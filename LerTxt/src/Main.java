import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.tt"))){
			String line;
			String string = "";
			
			while((line = reader.readLine()) != null)  { // While: ele vai procurar a linha certa procurando linha por linha
				string += line + "\n";
			}
			System.out.println(string);
				
			}
		String teste = "Mouse: funciona= sim, qtdBotoes= 2, tamanho = pequeno\n ";
		
		Mouse mouse = new Mouse(teste);
		
		System.out.println(mouse);
		}
		
		

	}


