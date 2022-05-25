
public class Aplicacao { // classe main para aplicaçao dos metodos

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();// intanciando objeto da classe ContaCorrente
		contaCorrente.depositar(250); // instancia de metodo depositar
		contaCorrente.transferir(400); // instancia de metodo transferir
		contaCorrente.sacar(900); // instancia de metodo sacar
		contaCorrente.calcularSaldo(); // instancia de metodo para calcular saldo

		System.out.println(); // pula a linha

		ContaInvestimento contaInvestimento = new ContaInvestimento(); // Instanciando objeto da classe ContaInvestimento
		contaInvestimento.depositar(25); // instanciando metodo depositar
		conta.Investimento.transferir(35); // instanciando metodo transferir
		contaInvestimento.sacar(30); // instanciando metodo sacar
		contaInvestimento.calculaSaldo(); // instanciando metodo para calcular saldo

	}

}
