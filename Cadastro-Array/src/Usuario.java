
public class Usuario {

	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Usuario() {
	}
	public Usuario(String linha) {
		
		String[] arrayLinha = linha.split(",");
		String[] arrayNome = arrayLinha[0].split("=");
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayIdade[1].trim());
		
		String[] arraySexo = arrayLinha[2].split("=");
		this.sexo = Sexo.valueOf(arraySexo[1].trim());
		
		Endereco endereco = new Endereco(arrayLinha);
		this.endereco = endereco;
		
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
		return "Usuario: nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", endereco=" + endereco;
	}
	
	
	
	
	
	
	
	
	
	
}

