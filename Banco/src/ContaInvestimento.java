
public class ContaInvestimento extends ContaBancaria { // classe herda a super classe(ContaBancaria)

	@Override
	public double calcularSaldo() { // override do m�todo calcular saldo da superclasse.

		double saldofinal; // vari�vel criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 1.05; // f�rmula para calcular o saldo acrescido de 5%

		System.out.println("Seu saldo final na Conta investimento � R$ " + saldofinal);// informa�ao que vai mostrar na tela
		return saldofinal;
	}

}
