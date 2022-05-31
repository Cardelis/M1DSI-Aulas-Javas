
public class Lampada {
	public  boolean estado; // atributo da lampada
	
	
	public Lampada () {
		estado = true;
		
	}


	public void ligar() { // metodo ligar
		estado = true;
	}

	public void desligar() { // metodo desligar
		estado = false;
	}

	public void imprimir() {// metodo imprimir
		if (estado == true) { // teste condicionl que permite avaliar se é VERDADEIRO ou FALSO
			System.out.println("Lampada ligada");// Mostra informaca na tela
		} else {
			System.out.println("Lampada desligada");

		}
	}

}
