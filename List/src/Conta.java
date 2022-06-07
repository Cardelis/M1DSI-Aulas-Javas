
public class Conta {

	// atributos da classe
	String nome;
	double valor;

	public Conta(String nome, double valor) {

		this.nome = nome; // para mostrar que esse é um atributo da Classe 
		this.valor = valor; // para mostrar que esse é um atributo da Classe 
	}

	@Override  //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public String toString() { // toString: retorna escrito o valor de todas as variaveis da classe
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

}
