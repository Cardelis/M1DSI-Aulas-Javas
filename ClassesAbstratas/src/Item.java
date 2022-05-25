
public abstract class Item {
	
	private int posX; // Variavel privada, só é visivel pela classe
	private int posY; // Variavel privada, só é visivel pela classe

	public  void pegar() { // Criando o metodo pegar, ele tem extençao atraves da herança para as subclasses
		
	}

	// getters e setters
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	

}

