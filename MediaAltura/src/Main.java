import java.util.Scanner;
public class Main {

public static void main(String[] args)   {

	String nome ;
	int sexo, qtMulheres=0, qtHomens=0;
	float altura, somaH=0, mediaHomens=0, maior=0, menor=10;
	
	Scanner entrada = new Scanner(System.in);
//	System.out.println("Digite o nome");
//    entrada.next(nome);
	
	for (int i=0; i<10; i++) {
		System.out.print("Escolha o sexo  (1-Mulher, 2-Homem): ");
		sexo = entrada.nextInt();
		System.out.print("Digite a altura: ");
		altura = entrada.nextFloat();
		if (sexo == 1) {
			qtMulheres++;
		} else if (sexo == 2) {
			qtHomens++;
			somaH = somaH + altura;
		} else {
			System.out.println(" sexo inválido!");
		}
		if (altura > maior) {
			 maior = altura;
		} else if (altura < menor){
			menor = altura;
		}
	}
	mediaHomens = somaH / qtHomens;
	
	System.out.println("A maior altura do grupo é de " + maior + " m, e a menor e de " + menor + " m");
	System.out.println("A média de altura dos homens e " + mediaHomens + " m");
	System.out.println("O número de mulheres e " + qtMulheres);

	entrada.close();
	
	
		
		
		
			
	
		}


	}


