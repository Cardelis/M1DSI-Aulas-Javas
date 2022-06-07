
public class Aplicacao {

	public static void main(String[] args) {
		
                // instancia de objetos
		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
		Fusca fusca = new Fusca();
		rota.ir(ferrari); //  metodo ir da classe rota que passa como parametro uma variavel do tipo ferrari
		rota.ir(fusca); //  metodo ir da classe rota que passa como parametro uma variavel do tipo fusca
		System.out.println();
		rota.ir(fusca);
		
		Automovel automovel = new Ferrari(); // nao precissa estanciar uma variavel automovel,Como a classe Ferrari tambem implementa automovel, posso implementar ela direto
		rota.ir(automovel);
		automovel = new Fusca();
		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor(); // instanciando objeto
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
		

	}

}
