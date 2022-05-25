
public class ContaCorrente extends ContaBancaria { // classe publica que herda a super classe (ContaBancaria)

	@Override
	public double calcularSaldo() { // override do m�todo calcular saldo da superclasse.
		double saldofinal; // vari�vel criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 0.90; // f�rmula para calcular o saldo menos 10%

		System.out.println("Seu saldo final na Conta Corrente � R$ " + saldofinal); // informa�ao que vai mostrar na tela
		return saldofinal;
	}

}
