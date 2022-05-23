
public class Usuario {

	private String nome;
	private int idade;
	Endereco endereco;
	
	


	public Usuario(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}
	
	
	
	
	
	
	
}

