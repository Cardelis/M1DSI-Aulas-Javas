
public abstract class ContaBancaria {
	
	//modificador de acceso protected double saldo;
	
private int saldo = 1000;
	


	
	public void depositar(int valor) {
		double saldoFinal;
		saldoFinal = saldo + valor;
		System.out.println( "Voce depositou" + valor);

	}
	public void sacar(int valor) {
		if (saldo>valor) {
		double saldoFinal;
		saldoFinal = saldo - valor;
		System.out.println( "Voce depositou" + valor);
		} else {
			System.out.println("Seu saldo é insuficiente");
		}
	}
	public void transferir(int valor) {
		if(saldo>valor) {
		double saldoFinal;
		saldoFinal = saldo - valor;
		System.out.println("Voce transferiu" + valor);
		}else {
			System.out.println("Seu saldo é insuficiente");
		}
			
		
		
	}


	}


