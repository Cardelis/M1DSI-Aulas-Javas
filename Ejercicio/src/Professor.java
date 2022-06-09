
public class Professor extends Usuario{

	private double salario;
	
	public Professor(String nome, int cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
