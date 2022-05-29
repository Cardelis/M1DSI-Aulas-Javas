// importaçoes da JRE
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {// classe main chamada para JVM

	public static void main(String[] args) throws IOException {// intrface IOExcepion: trata o possivl erro que pode dar

		String s = "Mediano";
		Mouse mouse1 = new Mouse(false, 2, s); // Intancia de objeto
		Mouse mouse2 = new Mouse(false, 2, s); // Intancia de objeto
		Mouse mouse3 = new Mouse(false, 4, s); // Intancia de objeto

		List<Mouse> listaDeMouses = new ArrayList<Mouse>(); // 

		listaDeMouses.add(mouse1);
		listaDeMouses.add(mouse2);
		listaDeMouses.add(mouse3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) { // classe responsavel por
			for (Mouse mouse : listaDeMouses) // guardar inormacao no
				// buffer( bufferwriter)(
				// FileWriter abRe o caminho
				// para o arquivo no HD("
				// try: analisa s da o erro, e abre e fecha as portas que o buffer ta abrindo

// dentro do file ele procura se tem um arquivo

				escrever.write(mouse.toString()); // to string e o metodo que a gente usa para poder subcrever
		}

	}

}
