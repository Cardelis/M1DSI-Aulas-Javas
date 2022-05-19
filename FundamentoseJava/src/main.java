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

		// System.out.println(-------------------------------------------);

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
		// System.out.println(------------------------------------------);

//		int x = 8;
//		while (x<10) {
//			System.out.println(x); //Chamada de metodo
//			x = x + 1;
//			
//		}
//		
//		x=10;
//		
//		do {
//			System.out.println(x); // Chamada de metodo
//			x=x+1;
//	}while(x<10);
//	
//		Scanner ler = new Scanner(System.in);
//		System.out.println("CUAL NUMERO QUIERE?"); // Mostra informaçao na tela
//
//		int y;
//
//		y = ler.nextInt();
//
//		for (int x = 0; x < 11; x++) {
//			System.out.println(y + "x" + x + "= " + x * y);
//
//		}

//		// MATRIZES
//		int x1 = 3;
//		int y1 = 5;
//		int z1 = 7;
//
//		System.out.println(x1); // Chamada de metodo
//		System.out.println(y1);
//		System.out.println(z1);
//
//		double x[] = { 3, 5, 3, 5 };
//
//		for (int aux = 0; aux < x.length; aux++) {
//			System.out.println("valor do indice" + aux + "=" + x[aux]);
//		}
//		String nome[] = { "Jonathan", "Cardelis", "Bia" };
//
//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "Cardelis") {
//				System.out.println("O indice de Cardelis é = " + aux1);
//			}
//
//		}
//
//		int[] arrayInt = new int[5];
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[3];
//
//		arrayInt[3] = 4;
//
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in); // Scanner para receber informaçao do usuario
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("Digite um numero qualquer");
//			numero[aux2] = teclado.nextInt();
//		}
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("Indice" + aux2 + "=" + numero[aux2]);

		// }

		int[] arrayQualquer = new int[3]; // Chamando o construtor
		Object[] arrayObject = new Object[6];
		
		//  Colocando informaçoes d diferentes tipos na Array
		arrayObject[0] = 12;
		arrayObject[1] = "Cardelis";
		arrayObject[2] = 13.8;
		arrayObject[3] = true;
		arrayObject[5] = arrayQualquer;

		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) // Length: Tamanho da matriz
		{
			System.out.println("Indice " + aux2 + "=" + arrayObject[aux2]); // Mostra informaçao na tela

		}
		
		int[][] arrayBidirecional = new int [4][3];
		
		arrayBidirecional[0][0]=8;
		arrayBidirecional[2][1]=7;
		
		for( int linha = 0; linha < arrayBidirecional.length;  linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("Indice [" +linha+ "][" +coluna+"]  = " + arrayBidirecional[linha][coluna]+"  ");
				
			
			}
			System.out.println();
		}
	}
}
