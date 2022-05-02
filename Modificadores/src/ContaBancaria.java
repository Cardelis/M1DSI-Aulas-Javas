
public class ContaBancaria {

	private int numCont;
	private boolean ativo;
	private double saldo;

	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}

	public ContaBancaria(boolean ativo, double saldo) {
		
	}

	public void receber(double valor) {
		saldo += valor;

	}

	public double saldo() {
		return saldo;
	}

	public void dar(double valor) {
		if (saldo >= valor)
			saldo -= valor;

	}
}
