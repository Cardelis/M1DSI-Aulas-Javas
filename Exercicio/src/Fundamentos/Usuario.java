package Fundamentos;

public class Usuario {

	String nome;
	int cpf;
	double salario;
	int total;

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", total=" + total + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
