package Figurinha;

public class Pessoa {
	// Criando atributos para a classe 
	String nome;
	int numFigurinhas;
	// O atributo x serve para controlar a mensagem que será mostrada
	int x=1;
	
	// Metodo que recebe as figurinhas
	void Receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
		
	}
	
	// Metodo que da as figurinhas
	void Dar(int numFigurinhas, Pessoa pessoa) {	
		//teste condicional para impedir que o usuario de mais figurinhas do que ja tem
		if(this.numFigurinhas < numFigurinhas) {
			System.out.println("Você não pode trocar, pois não possui a quantidade necessária de figurinhas \n");
			x=2;
		}else {
		this.numFigurinhas -= numFigurinhas;
		pessoa.Receber(numFigurinhas);
		}
	}
}
