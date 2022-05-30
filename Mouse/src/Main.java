// IMPORTACOES DA JRE
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// crie 3 objetos
		Mouse mouse = new Mouse("sim", "5", "grande");
		Mouse mouse2 = new Mouse("nao", "6", "mediano");
		Mouse mouse3 = new Mouse("sim", "4", "pequeno");

		// CRIE LISTA DE MOUSES ESCRITOS
		List<Mouse> listaDeMouses = new ArrayList<Mouse>();
// PRENTE A LISTA
		listaDeMouses.add(mouse);
		listaDeMouses.add(mouse2);
		listaDeMouses.add(mouse3);

		// PARA GRAVAR NO ESCREVER TXT
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) { //
			for (Mouse mouses : listaDeMouses)

				escrever.write(mouses.toString()+"\n"); // to string e o metodo que a gente usa para poder subcrever

		}

		// CRIE LISTA DE MOUSES ESCRITOS
		List<Mouse> listadeMousesLidos = new ArrayList<Mouse>();

		try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) { // While: ele vai procurar a linha certa procurando linha por
															// linha
				Mouse mouse4 = new Mouse(line);// CADA VEZ QUE DE (NEW) ELE TRNSFORMAREM EM VAI CRIAR UM OBJETO
				listadeMousesLidos.add(mouse4);// GRAVAR NO NOVO LIT
			}

		}
// PEGA A LISTA DE MOUSES LIDOS E MOSTRA NA TELA
		for (Mouse mousesLidos : listadeMousesLidos)
			System.out.println(mousesLidos.toString());// to string e o metodo que a gente usa para poder subcrever

	}

}
