
public class Pessoa {
	// Atributos
	String nome;
	int numFigurinhas;
	
	void receber(int numfigurinhas) { // metodo receber
	    this.numFigurinhas += numfigurinhas; // Construtor que vai somar os numFigurinhas e vai guardar o resultado na variavel
	    
	}
	
    boolean dar(int numFigurinha, Pessoa pessoa) {
    // boolean retorno;
    
    	if(this.numFigurinhas<numFigurinha) { //Condiçao Logica 
    		System.out.println("Aquantidade de figurinhas nao é suficiente para realizar o metodo"); // mostra na tela 
    		// retorno = false;
    		return false; // Retorno boolean: quando uma variavel é
    	}
    	else { //Condiçao Logica
    		this.numFigurinhas -= numFigurinha;
        	pessoa.receber(numFigurinha);
        	// retorno = true;
        	return true;
    	}
    	
    	// return retorno;
		
    	
    

    	
	}
	

}
