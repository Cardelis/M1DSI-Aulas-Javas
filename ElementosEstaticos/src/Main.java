

public class Main {

	public static void main(String[] args) {
		
		
		
		int resultado = Matematica.somar(2, 3);// Como o metodo somar da classe matematica e estatico, nao houve a necessidade de instanciar um objeto para chama-lo
		
		System.out.println(resultado);
		
		
		resultado = Matematica.subtrair(10, 4); // chamando o metodo subtrair da classe matematica
		
		System.out.println(resultado);
		
		// Chamando os metodos usando objeto
		// Foi instanciado 3 objetos 
		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		// O objeto chamou o metodo incrementar da classe 
		contador1.incrementar();
		
		// chamado 3 vezes o metodo getValor por meio dos objetos criados
		System.out.println(contador1.getValor());
		System.out.println(contador2.getValor());
		System.out.println(contador3.getValor());
		
		// metodo incrementar foi chamado direto pela classe sem a necessidade e instanciar um objeto, pois e um metodo estatico 
		Contador.incrementar();
		
		System.out.println(Contador.getValor()); // A mesma coisa para o getValor
		
		
		System.out.println(Constantes.MEDIA_DA_PROVA); // prentado a contatante Media da prova
	}

}
