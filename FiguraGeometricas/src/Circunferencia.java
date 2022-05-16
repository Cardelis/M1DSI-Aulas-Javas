
public class Circunferencia implements AreaCalculavel {

	 int raio = 120;

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
		double area;
		area = Math.PI*Math.pow(2, raio);
		System.out.println("A area da circunferencia é: "  +   area );
		
	}
	 
	 
}
