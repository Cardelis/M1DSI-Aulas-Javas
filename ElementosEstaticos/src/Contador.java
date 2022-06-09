
public class Contador {
	private static int valor;
	
//	public Contador() {
//		this.valor = 10;
//	}
	
	// Aqui foi definido  um valor que e 1
	static {
		valor = 1;	
	}

	// Aqui foi definida uma variavel estatica que sempre vai somar 1, ao valor
	public static void incrementar() {
		valor ++;
	}

	// Getter que vai pegar o valor da variavel valor 
	public static int getValor() {
		return valor;
	}

}
