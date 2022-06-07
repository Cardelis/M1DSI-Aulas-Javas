
public class Main {
	
	public static final double PI = 3.14; // Criando constante(final determina que é constante)
	
	private enum Sexo{ // Enum dentro da classe
		MASCULINO, FEMENINO
	}

	public static void main(String[] args) {
		
		
		double pi = Main.PI; // instanciando uma variavel
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //Instanciando objeto da classe DiaDaSemana e passa SEGUNDA como parametro
		
		int num = DiaDaSemana.SEGUNDA.getNum(); //  Instanciando variavel do tipo int. O getNum vai atribuir um numero o dia da semana, conforme feito na classe Enu
		System.out.println(num);
		
		String s = "TERCA"; // criando variavel para chamar parametro do emum
		// O objeto hoje, criado acima, e convertido para String a fim de receber o dia da semana
		hoje = DiaDaSemana.valueOf(s); // procura lista de constantes de DiaDaSemana
		
		System.out.println(hoje.getNum());
		//chamar um Enum utilizando um objeto
		Sexo sexo = Sexo.MASCULINO;
		sexo = Sexo.FEMENINO;
		

	}

}
