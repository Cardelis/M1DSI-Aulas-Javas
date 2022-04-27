import java.util.Scanner;
public class main {

	public static void main(String[] args) {
//
//		int x = 100;
//		double y = 200;
//		int a = 0;
//		double b = 0;
//		short z = (short) 100000;
//		System.out.println(z);
//
//		byte t = 100;
//		System.out.println(t);
//
//		a = (int) y;
//		b = x;
//
//		System.out.println(a);
//		System.out.println(b);
//
//		int idadePessoa = 25;
//
//		if (idadePessoa < 20) {
//			System.out.println("Voce nao pode beber");
//		} else if (idadePessoa < 80) {
//			System.out.println("Bora tomar uma");
//		} else {
//			System.out.println("Quanto é a sua aposentadoria?");
//		}
//		System.out.println("Voce tem " + idadePessoa);
		
		//System.out.println(-------------------------------------------);

//		int num = 9;
//
//		switch (num) {
//		case 1:
//			System.out.println("Lunes " );
//			break;
//		case 2:
//			System.out.println("Martes" );
//			break;
//		case 3:
//			System.out.println("Miercoles " );
//			break;
//		case 4:
//			System.out.println("Jueves"  );
//			break;
//		case 5:
//			System.out.println("Viernes " );
//			break;
//		case 6:
//			System.out.println("Sabado " );
//			break;
//		case 7:
//			System.out.println("Domingo" );
//			break;
//			default:
//				System.out.println("Ese numero no representa un dia de la semana");

		// }
		//System.out.println(------------------------------------------);

//		int x = 8;
//		while (x<10) {
//			System.out.println(x);
//			x = x + 1;
//			
//		}
//		
//		x=10;
//		
//		do {
//			System.out.println(x);
//			x=x+1;
//	}while(x<10);
//	
Scanner ler = new Scanner(System.in);
System.out.println("CUAL NUMERO QUIERE?");


int y;

y = ler.nextInt();

	for(int x=0;  x<11; x++) {
		System.out.println(y + "x" + x + "= " + x*y);
		
}
}
}

