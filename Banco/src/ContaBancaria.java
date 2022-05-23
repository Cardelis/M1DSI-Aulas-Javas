
public abstract class ContaBancaria {
	
	//modificador de acceso protected double saldo;
	
private double saldo = 100; // atributo visivel apenas para as subclasses
	


	
	public double depositar(double valor) {
		saldoFinal = saldo + valor;
		System.out.println( "Voce depositou" + valor);
		return saldo;

	}
	public double sacar(double valor) {
		if (valor>saldo) {
			syso(Você não tem valor sufuciente para fazer esse saque. Seu saldo atual é " + saldo)
		} else {
			saldo= saldo-valor;
			System.out.println("Saque de R$ " + valor +  realizado");
					  
		}
					    return saldo;
	}
	public double transferir(double valor) {
		if (valor>saldo)) {
		System.out.println("Você não tem valor sufuciente para fazer essa transferência. Seu saldo atual é " + saldo);
		}else {
	        saldo= saldo-valor;
		System.out.println("Transferência de R$ " + valor + " realizado.");
		}
		return saldo;	
		
		
			public abstract double calcularSaldo();  //regra do cálculo do saldo final
		
	

		
		//Getters e Setters
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	}



