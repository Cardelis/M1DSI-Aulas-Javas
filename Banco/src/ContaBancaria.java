
public abstract class ContaBancaria { // classe abstrata nao pode ser instanciada

	private double saldo = 15; // visivel so para as subclasses

	public double depositar(double valor) { // criando metodo para somar um valor ao saldo inicial
		saldo = saldo + valor;
		System.out.println("Deposito de r$ " + valor + " realizado."); // Informaçao que vai mostrar a tela
		return saldo;
	}

	public double sacar(double valor) { //criando metodo para sacar valor do saldo inicial
		if (valor > saldo) { //  teste condicional para ter certeza de ter o valor suficiente para fazer o saque
			System.out.println("Vocce nao tem valor suficiente para sacar. Seu saldo e " + valor);// informaçao que vai mostrar na tela se este teste fosse certo
		} else { // teste condicional para ter certeza de que tem o valor suficiente para fazer o saque
			saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado."); // informaçao que vai mostrar na tela
		}
		return valor;
	}

	public double transferir(double valor) {// criando metodo para sacar valor inicial
		if (valor > saldo) { // teste condicional para ter certeza de ter o valor suficiente para fazer a transferencia
			System.out.println("Voce nao tem valor sufuciente para fazer a tranferencia."); // informaçao que vai mostrar na tela
		} else {  // teste condicional para ter certeza de que tem o valor suficiente para fazer a transferencia
			saldo = saldo - valor;
			System.out.println("Tranferencia de R$ " + valor + " realizado"); // informaçao que vai mostrar na tela
		}
		return valor;
	}

	public abstract double calcularSaldo(); // criando metodo que va regra do calculo final

	// getters e setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;i 
	}

}
