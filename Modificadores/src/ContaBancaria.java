
public class ContaBancaria {
	
	private int numCont;
	private boolean ativo;
	private double saldo;
	
	
	public ContaBancaria () {
		ativo = true;
		saldo = 1.0;
	}
	public void receber(double valor) {
	saldo += valor;
	
	}
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}
	
	public double saldo() {
return saldo;
}
	
	public void dar (double valor) {
		if(saldo >= valor)
		saldo -= valor;
		
	}
}
