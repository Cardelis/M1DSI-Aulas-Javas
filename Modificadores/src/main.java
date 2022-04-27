
public class main {

	public static void main(String[] args) {
		
		
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		
////		conta1.ativo = true;
////		conta1.numCont = 1520;
////		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numCont);
//		System.out.println(conta1);
//	}

		//conta1.receber(800);
		//conta1.dar(500);
		 System.out.println(conta1.saldo());
		 
		 
		 ContaBancaria conta2 = new ContaBancaria();
		 System.out.println(conta2.saldo());
		 
		 
		 }
}
