
public class Main {
	
	public static final double PI = 3.14; // Criando constante(final determina que é constante)
	
	private enum Sexo{ // Enum dentro da classe
		MASCULINO, FEMENINO
	}

	public static void main(String[] args) {
		
		
		double pi = Main.PI; // acessando a constante static
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;     // dentro dela so consigo guardar endereços dos objetos PRONTOS dos enum que estao em dia da semama (so cosegue mostrar endereço dos objeto no enum  
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA"; // criando variavel para chamar parametro do emum
		
		hoje = DiaDaSemana.valueOf(s); // procura lista de constantes de DiaDaSemana
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.MASCULINO; // 
		sexo = Sexo.FEMENINO;
		

	}

}
