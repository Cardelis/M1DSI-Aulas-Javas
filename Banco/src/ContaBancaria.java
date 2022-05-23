
public abstract class ContaBancaria {
	
	private double saldo = 15;
	
	public double depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("Deposito de r$ " + valor +  " realizado." );
		return saldo;
	}

	public double sacar(double valor) {
		if (valor>saldo) {
			System.out.println("Vocce nao tem valor suficiente para sacar. Seu saldo e " + valor );
		}else {
			saldo = saldo-valor;
			System.out.println("Saque de R$ " + valor + " realizado." );
		}
		return valor; 
	}
	public double transferir(double valor) {
		if(valor>saldo) {
			System.out.println("Voce nao tem valor sufuciente para fazer a tranferencia.");
		}else {
			saldo = saldo-valor;
			System.out.println("Tranferencia de R$ " + valor + " realizado");
		}
		return valor;
	}
	
	public abstract double calcularSaldo(); // regra do calculo final

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
	
		
		
		
	         


