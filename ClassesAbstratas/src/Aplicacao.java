
public class Aplicacao {

	public static void main(String[] args) {

		// Item item = neww Item(); -----Classes adstratas a gente nao consegue instanciar-----

		Item item = new Cogumelo();
		item.pegar();

		item = new Moeda();
		item.pegar();

		item = new Diamante();
		item.pegar();
	}

}
