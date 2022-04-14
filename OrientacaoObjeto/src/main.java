
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		System.out.println(pessoa1);
		
		
		pessoa1.nome = "Cardelis";
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "Jonathan";
		pessoa2.numFigurinhas = 3;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);
		
		pessoa1.dar (30, pessoa2);
		
		System.out.println("depois");
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);
				

	}

}
