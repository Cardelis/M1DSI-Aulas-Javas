
public class ContaBancaria {

	// Atributos privados da classe
	
	private int numCont;
	private boolean ativo;
	private double saldo;

	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}

	// Construtor  que recebe apenas o saldo e se a conta esta ou nao ativa
	public ContaBancaria(boolean ativo, double saldo) {
		
	}

	// Metodo que mostra o valor recebido e soma com  o saldo que ja existia
	public void receber(double valor) {
		saldo += valor;

	}

	// Metodo que mostra o saldo que tem na conta
	public double saldo() {
		return saldo;
	}


	public void dar(double valor) {
		if (saldo >= valor)
			saldo -= valor;

	}
}
