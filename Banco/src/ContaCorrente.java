
public class ContaCorrente extends ContaBancaria { // classe publica que herda a super classe (ContaBancaria)

	@Override  //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public double calcularSaldo() { // metodo calcular saldo da superclasse.
		double saldofinal; // variável criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 0.90; // fórmula para calcular o saldo menos 10%

		System.out.println("Seu saldo final na Conta Corrente é R$ " + saldofinal); // informaçao que vai mostrar na tela
		return saldofinal;
	}

}
