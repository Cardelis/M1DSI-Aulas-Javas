
public class Aplicacao {

	public static void main(String[] args) {
		
		// Instanciando objeto e atribuindo  valores da data
		Data d1 = new Data(20, 05, 2010, 0, 30, 10);
		// Chamando metodos imprimir 
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);
		
		
		Data d2 = new Data(20, 09, 2010, 23, 15, 20);
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
	
		Data d3 = new Data(5, 11, 2006);
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
	}
}
