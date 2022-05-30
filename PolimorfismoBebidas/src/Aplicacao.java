
public class Aplicacao {

	public static void main(String[] args) { // Metodo main para permitir a execucao do programa no console

		Preparador preparador = new Preparador(); // Intanciando objeto da classe

		LeiteQuente leiteQuente = new LeiteQuente();// Intanciando objeto da classe
		preparador.prepararBebida(leiteQuente); //preparando a bebida , realizando um metodo em um obejeto

		Refrigerante refrigerante = new Refrigerante();// Intanciando objeto da classe
		preparador.prepararBebida(refrigerante); //preparando a bebida , realizando um metodo em um obejeto
	}

}
