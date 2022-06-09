import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)   throws IOException {
		
		Mecanico mecanico1 = new Mecanico("Fernando", 708, 22.0);
		Mecanico mecanico2 = new Mecanico("Alejandro", 70, 25.0);
		
		Servico servico1 = new Servico("Troca de pineu", 5.0,25.0, mecanico1);
		Servico servico2 = new Servico("Troca de oleo" , 2.0, 35.0, mecanico2);
		

		List<Cliente> listaDeClientes =  new ArrayList<Cliente>();
		
		
		Cliente cliente1= new Cliente("Cardelis", 45855,  servico1, FormaPag.A_VISTA0);
		
		Cliente cliente2 = new Cliente("Jonathan", 24788,  servico1, FormaPag.CARTAO);
		
		Cliente cliente3 = new Cliente("Brbara", 55855,  servico2, FormaPag.A_VISTA0);
		
		Cliente cliente4 = new Cliente("Delida", 65555,  servico2, FormaPag.CARNE0);

		listaDeClientes.add(cliente1);
		listaDeClientes.add(cliente2);
		listaDeClientes.add(cliente3);
		listaDeClientes.add(cliente4);
		
		for (Cliente cliente : listaDeClientes) {
			System.out.println("O cliente " + cliente.getNome() + " de CPF " + cliente.getCpf() + "Recebeu o servico" + cliente.getServico().getNomeServico());
			System.out.println("Seu mecanico é" + cliente.getServico().getMecanico().getNome());
			System.out.println("sua forma de pagamento é" + cliente.getFormaPag());
			System.out.println("valor total é:" + cliente.getValorPagarServico());
			System.out.println("------------------------------------------------------------------------------");
			
	
		}
		
	
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			for (Cliente cliente : listaDeClientes)
			escrever.write(cliente.toString() + "\n");
		
	}

}
}

