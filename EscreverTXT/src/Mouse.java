
public class Mouse {

	// criando atributos de mouse
	private boolean funciona;
	private int qtdBotoes;
	private String tamanho;

	// constroi na memoria RIP um novo mouse cada vez que dou NEW
	public Mouse(boolean funciona, int qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}

	@Override // sobrscrita o metodo da super classe
	public String toString() { // to string e o metodo que a gente usa para poder subcrever( transformo o
								// endere�o da variavel no objeto
		return "Mouse [funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "]\n";
	}

// getters e setters
	public boolean isFunciona() {
		return funciona;
	}

	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

	public int getQtdBotoes() {
		return qtdBotoes;
	}

	public void setQtdBotoes(int qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
