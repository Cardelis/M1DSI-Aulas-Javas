
public class Rota {

	public void ir(Automovel automovel) { //metodo que recebe como parametro uma variavel automovel do tipo automovel que chama os metodos da interface

		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelera();
		automovel.virarDireita();

	}

}
