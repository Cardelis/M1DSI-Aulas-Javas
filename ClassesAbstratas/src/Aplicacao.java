
public class Aplicacao {

	public static void main(String[] args) {

		// Item item = new Item(); -----Classes adstratas nao consegue instanciar-----

		Item item = new Cogumelo(); // Criando objeto do tipo classe
		item.pegar(); // Metodo que o objeto vai realizar

		item = new Moeda(); // Criando objeto do tipo classe
		item.pegar();// Metodo que o objeto vai realizar

		item = new Diamante();// Criando objeto do tipo classe
		item.pegar();// Metodo que o objeto vai realizar
	}

}
