
public class Conta {

	String nome;
	double valor;

	public Conta(String nome, double valor) {

		this.nome = nome; // para mostrar que esse é um atributo da Classe 
		this.valor = valor; // para mostrar que esse é um atributo da Classe 
	}

	@Override 
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

}
