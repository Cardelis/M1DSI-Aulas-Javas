
public class Endereco {

	String rua;  //atributos da classe endere�o
	int numero;
	String bairro;
	
	// toString para retornar todos os atributos dos usu�rios
	@Override
	public String toString() {
		return "Endere�o [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + "]";
	}
	
	//m�todos getters e setters
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
	
		
	

}


