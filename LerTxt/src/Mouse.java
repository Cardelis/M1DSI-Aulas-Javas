
public class Mouse {

	// criando atributos de mouse
	private String funciona;
	private String qtdBotoes;
	private String tamanho;

	// constroi na memoria RIP um novo mouse cada vez que dou NEW
	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}

	@Override //  é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
	public String toString() { // toString: retorna escrito o valor de todas as variaveis da classe
		return "Mouse: funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "\n";
	}

	public Mouse(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");// split: ele quebra a string onde este uma (,)
		this.funciona = arrayAuxiliar2[1].trim(); // trim: remover espacos em branco no inicio ou no final do texto

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.qtdBotoes = arrayAuxiliar3[1].trim();

		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.tamanho = arrayAuxiliar4[1].trim();

	}

// getters e setters
	public String isFunciona() {
		return funciona;
	}

	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}

	public String getQtdBotoes() {
		return qtdBotoes;
	}

	public void setQtdBotoes(String qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
