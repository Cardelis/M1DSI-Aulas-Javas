
public class Bebida {
	
	//Criando atributos
	private String nome;
	private boolean aquecer;
	
	
         //Construtor da classe Bebida: usado para que outras classes possa acessar os atributos privados da classe atual
	public Bebida(String nome, boolean aquecer) { // criando objeto
		super();
		this.nome = nome; // para mostrar que esse é um atributo da Classe 
		this.aquecer = aquecer; // para mostrar que esse é um atributo da Classe 
	}
	// metodo generico para Bebidas
	public void preparar() { // Criando metodo
		System.out.println("Pegando o copo");
	
	}
	// Metodos GETTERS e SETTERS

	public String getNome() { 
		return nome; 
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	

}
