// Importacoes da JRE
import java.util.Objects;

public class Cliente {

	// criando atributos privados
	private String nome;
	private int cpf;
	private int numConta;

	public Cliente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public String toString() {  // toString: retorna escrito o valor de todas as variaveis da classe 
		return  "Cliente: \nnome =" + nome + ", \nCPF = " + cpf + ", \nNumero da conta = "+    numConta  ;
	}

	@Override
	public int hashCode() { // hashCode: retorna variaveis como objetos
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) { // equals : mostrar que dois objetos com o mesmo conteudo nao sejam iguais
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}

}
