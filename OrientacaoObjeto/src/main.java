
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa(); //Instanciando variavel da classe pessoa
		System.out.println(pessoa1);

		pessoa1.nome = "Cardelis";// accesando ao atributo por meio de pessoa
		pessoa1.numFigurinhas = 1;// accesando ao atributo por meio de pessoa

		pessoa1.receber(3); // acessando ao metodo receber

		System.out.println(pessoa1.nome); // Mostra na tela
		System.out.println(pessoa1.numFigurinhas);

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Jonathan"; // accesando ao atributo por meio de pessoa
		pessoa2.numFigurinhas = 3; // accesando ao atributo por meio de pessoa

		System.out.println(pessoa2.nome); // Mostra na tela
		System.out.println(pessoa2.numFigurinhas);

		boolean retorno = pessoa1.dar(7, pessoa2); // vair retornar um boolean de pessoa1.dar
		if (retorno == true) { // teste condicional para ver se retorna igual a TRUE

			System.out.println("depois");

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numFigurinhas);

			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numFigurinhas);
		}
	}

}
