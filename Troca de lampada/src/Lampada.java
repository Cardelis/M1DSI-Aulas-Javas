
public class Lampada {
	public  boolean estado;
	
	
	public Lampada () {
		estado = true;
		
	}


	public void ligar() {
		estado = true;
	}

	public void desligar() {
		estado = false;
	}

	public void imprimir() {
		if (estado == true) {
			System.out.println("Lampada ligada");
		} else {
			System.out.println("Lampada desligada");

		}
	}

}
