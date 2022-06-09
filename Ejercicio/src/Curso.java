
public class Curso{

	private String titulo;
	private double qtdHorasCurso;
	private double valorHoraCurso;
	private Professor professor;


	public Curso(String titulo, double qtdHorasCurso, double valorHoraCurso, Professor professor) {
		this.titulo = titulo;
		this.qtdHorasCurso = qtdHorasCurso;
		this.valorHoraCurso = valorHoraCurso;
		this.professor = professor;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getQtdHorasCurso() {
		return qtdHorasCurso;
	}

	public void setQtdHorasCurso(double qtdHorasCurso) {
		this.qtdHorasCurso = qtdHorasCurso;
	}

	public double getValorHoraCurso() {
		return valorHoraCurso;
	}

	public void setValorHoraCurso(double valorHoraCurso) {
		this.valorHoraCurso = valorHoraCurso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


}
