
public class Aplicacao {

	public static void main(String[] args) { // Metodo main para permitir a execucao do programa no console

		Preparador preparador = new Preparador(); // Intanciando a classe

		LeiteQuente leiteQuente = new LeiteQuente();// Intanciando objeto da classe
		preparador.prepararBebida(leiteQuente); //chamando o metodo preparar bebida

		Refrigerante refrigerante = new Refrigerante();// Intanciando objeto da classe
		preparador.prepararBebida(refrigerante); ////chamando o metodo preparar bebida
	}

}
