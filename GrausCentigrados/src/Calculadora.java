
public class Calculadora {
	
	double CE;
	double KE;
	double FH;
	double RE;
	double RA;
	double x;
	
	public void converter() {
		
		double x =  CE * 1.8 + 32;
		System.out.println("O valor em fahrenheit � : " + x );
		
		double y = CE + 273.15 ;
		System.out.println("O valor em Kelvin � : " + y );
				
		double z = CE * 0.8 ;
		System.out.println(" O valor em Reaumur � : " + z);
		
		double c = CE * 1.8 + 32 + 459.67;
		System.out.println("O valor em Rankine � : " + c);
	}
	
	
	}
	
	
	


