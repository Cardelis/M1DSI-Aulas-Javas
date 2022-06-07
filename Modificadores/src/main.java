
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

		// conta1.receber(800);
		// conta1.dar(500);
		System.out.println(conta1.saldo());

		ContaBancaria conta2 = new ContaBancaria();
		System.out.println(conta2.saldo());

		Cliente cliente1 = new Cliente(); // instanciando objeto da classe Cliente
		
                // Metodo setter 
		cliente1.setNome("Carlos");
		cliente1.setCpf(52);
		cliente1.setNumConta(52);
		
                // mostra informacao na tela
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());

		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Carlos");
		cliente2.setCpf(52);
		cliente2.setNumConta(52);
		
		
	System.out.println(cliente2);
	
	//cliente2 = cliente1;
	
	if(cliente1.getNome() == cliente2.getNome()){
		
	System.out.println("os nomes sao iguais");
	
	} else {
		System.out.println("os nomes sao diferentes");
	}

	if(cliente1.equals(cliente2)){  //Comparacao para saber se os dados dos dois clientes instanciados sao iguais
System.out.println("os atributos sao iguais");
}else {
	System.err.println("os atributos sao diferentes");
	
}
}

}
	
