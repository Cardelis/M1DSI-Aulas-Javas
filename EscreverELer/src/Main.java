import java.io.BufferedReader;// Quando chamo o import eu to falando para o Java onde esta ......... na JRE
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {// intrface IOExcepion: trata o possivel erro que pode dar

		Scanner scanner = new Scanner(System.in); // classe que permite obter entrada de dados primitivos
		String a = scanner.nextLine();// Pegue o scanner e guardei na string

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			escrever.write(a);

		}
		try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) { // classe responsavel por  guardar inormacao no buffer( bufferwriter)(FileWriter abRe o caminho para o arquivo no HD("try: analisa s da o erro, e abre e fecha as portas que o buffer ta abrindo)
			String line; //
			String string = "";

			while ((line = reader.readLine()) != null) { // While: ele vai procurar a linha certa procurando linha por
															// linha
				string += line + "\n";
			}
			System.out.println(string);
		}
	
	}
}
