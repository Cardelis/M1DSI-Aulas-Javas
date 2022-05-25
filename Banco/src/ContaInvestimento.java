
public class ContaInvestimento extends ContaBancaria { // classe herda a super classe(ContaBancaria)

	@Override
	public double calcularSaldo() { // override do método calcular saldo da superclasse.

		double saldofinal; // variável criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 1.05; // fórmula para calcular o saldo acrescido de 5%

		System.out.println("Seu saldo final na Conta investimento é R$ " + saldofinal);// informaçao que vai mostrar na tela
		return saldofinal;
	}

}
