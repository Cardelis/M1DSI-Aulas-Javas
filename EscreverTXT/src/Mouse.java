
public class Mouse {

	// criando atributos  privados de mouse
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

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public String toString() { /// toString: retorna escrito o valor de todas as variaveis da classe
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
