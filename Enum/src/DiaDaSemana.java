
public enum DiaDaSemana { // Tipo de classe enum: constroi valores dentro da RIP. conjunto de valore constantes
	
	//
	DOMINGO(1),// dentro dele vai ter um atributo tipo inteiro chamado NUM asocciado com o parametro
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int num; // Atributos nao consegue accesar de fora
	
	
	// construtor privado
	private DiaDaSemana(int num) {
	this.num = num; // construtor
	
	}
	// metodo getNum que retorna a variavel num
	public int getNum() {
		return num;
	
	}
	
}
