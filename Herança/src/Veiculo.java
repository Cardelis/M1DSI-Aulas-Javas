
public class Veiculo { // superclasse
	//criando atributos
	private String nome;
	//  protected permite que a subclasse veja esse atributo
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar() { // metodo buzinar
		System.out.println("BI BI"); // mostra informacao na tela
	}
 
	public void imprimir() { //  metodo para imprimir as informacoes na tela
		System.out.println("Marca: " + marca); // mostra informacao na tela
		System.out.println("Modelo: " + modelo); // mostra informacao na tela
		System.out.println("Ano: " + ano); // mostra informacao na tela
	}
		      // Metodos GETTERS e SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
