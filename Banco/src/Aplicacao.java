
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(250);
		contaCorrente.transferir(400);
		contaCorrente.sacar(900);
		contaCorrente.calcularSaldo();
		
		System.out.println();
		
		ContaInvestimento contaInvestimento = new ContaInvestimento();
		contaInvestimento.depositar(25);
		conta.Investimento.transferir(35);
		contaInvestimento.sacar(30);
		contaInvestimento.calculaSaldo();
		
		
	}

}
