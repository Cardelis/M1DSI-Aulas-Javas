
public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	
	


	public Endereco(String linha) {
		
	
		
		String[] arrayLinha = linha.split(",");
		String[] arrayRua = arrayLinha[3].split("=");
		this.rua = arrayRua[1].trim();
		
		String[] arrayNumero = arrayLinha[4].split("=");
		this.numero = Integer.parseInt(arrayNumero[1].trim());
		
		String[] arrayBairro = arrayLinha[5].split("=");
		this.rua = arrayBairro[1].trim();
	}
		
	


	public Endereco(String[] arrayLinha) {
	
	}


	public Endereco() {
		
	}




	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return "Endereco: rua=" + rua + ", numero=" + numero + ", bairro=" + bairro ;
	}
	
}
