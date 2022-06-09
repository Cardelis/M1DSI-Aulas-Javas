import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		Professor professor1 = new Professor("Rafael", 11111111,5000);
		Professor professor2 = new Professor("Mayara", 22222222,5000);
		
		Curso curso1 = new Curso("Dev Sistemas", 1125,5,professor1);
		Curso curso2 = new Curso("AWS", 40,5,professor2);
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno("Pedro", 3333333, curso1, FormPag.A_VISTA);
		listaAlunos.add(aluno1);
		
		Aluno aluno2 = new Aluno("Rafael", 44444444, curso1, FormPag.CARNE);
		listaAlunos.add(aluno2);
		
		Aluno aluno3 = new Aluno("Misael", 55555555, curso2, FormPag.A_VISTA);
		listaAlunos.add(aluno3);
		
		Aluno aluno4 = new Aluno("Sara", 66666666, curso2, FormPag.CARTAO_CREDITO);
		listaAlunos.add(aluno4);	

					
		try (BufferedWriter alunos = new BufferedWriter(new FileWriter("alunos.txt"))) {
			for (Aluno alu : listaAlunos) {
				alunos.write(alu+"\n");
				
				System.out.println("O aluno " + alu.getNome() + " esta matriculado no curso de " + alu.getCurso().getTitulo());
				System.out.println("Seu professor sera o " + alu.getCurso().getProfessor().getNome());
				System.out.println("Sua forma de pagamento sera " + alu.getFormaPag());
				System.out.println("Com valor total de: " + alu.getValorPagarCurso());
				System.out.println("---------------------------------------------------------------");
				
			}
		}
		
	}

}


