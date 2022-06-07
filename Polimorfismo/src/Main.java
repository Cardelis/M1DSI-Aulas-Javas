
public class Main extends Animal { // classe main extendida a superclasse Animal

	public static void main(String[] args) {

		Animal animal = new Cachorro(); // instaciando objeto do tipo da classe
		animal.Falar(); // metodo falar

		animal = new Gato();  // instaciando objeto do tipo da classe
		animal.Falar(); //  metodo falar

		Gato gato = new Gato(); // instanciando objeto da classe
		Cachorro cachorro = new Cachorro();// instanciando objeto da classe
		falar(gato); // chamo o metodo falar que vem do objeto gato
		falar(cachorro);  // chamo o metodo falar que vem do objeto cachorro
	}

	public static void falar(Animal a) {
		a.Falar();
		
		if(a instanceof Cachorro) { // insctanceof verifica se o objeto pertence a classe que eu estou comparando
			
			Cachorro c = (Cachorro) a; //  casting explicito : forcei o objeto cachorro a chamar o metodo morder
			
		c.Morder(); // metodo Morder
		}


	}
}
