package Fundamentos;

public class ProgramaRevisao {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario();
		usuario1.setNome("Cardelis");
		usuario1.setCpf(708885);
		usuario1.setSalario(1500.00);

		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getCpf());
		System.out.println(usuario1.getSalario());

		System.out.println();

		Usuario usuario2 = new Usuario();
		usuario2.setNome("Jonathan");
		usuario2.setCpf(2412255);
		usuario2.setSalario(2500.00);

		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getCpf());
		System.out.println(usuario2.getSalario());

		System.out.println();

		System.out.println("Diferença do salario dos dois funcionarios é de ");

		System.out.println(usuario1.salario - usuario2.salario);

	}

}
