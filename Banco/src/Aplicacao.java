
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(); // Instanciar Objeto(Da classe ContaCorrente
		contaCorrente.depositar(200); // depositar 200 reais no saldo conta corrente
		contaCorrente.transferir(250); // Transferir 250 reais
		contaCorrente.sacar(1500); // sacar 1000 reais
		contaCorrente.calcularSaldo(); // Calcular saldo final
		System.out.println(); // pular linha
		
		ContaInvestimento containvestimento = new ContaInvestimento();
		containvestimento.depositar(60);     //depositar 200 reais no saldo da containvestimento
		containvestimento.transferir(30);    //transferir 40 reais no saldo da containvestimento
		containvestimento.sacar(10);         //sacar 200 reais no saldo da containvestimento
		containvestimento.calcularSaldo();   //calcular saldo final
	

	}
	}
	

}

