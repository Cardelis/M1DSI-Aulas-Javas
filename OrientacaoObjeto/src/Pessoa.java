
public class Pessoa {
	String nome;
	int numFigurinhas;
	
	void receber(int numfigurinhas) {
	    this.numFigurinhas += numfigurinhas;
	    
	}
	
    boolean dar(int numFigurinha, Pessoa pessoa) {
    // boolean retorno;
    
    	if(this.numFigurinhas<numFigurinha) { //Condiçao Logica
    		System.out.println("Aquantidade de figurinhas nao é suficiente para realizar o metodo");
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
