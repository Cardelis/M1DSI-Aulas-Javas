
public class Aluno extends Usuario{

	@Override
	public String toString() {
		return "Aluno = " +getNome() + " - CPF: " + getCpf() +" - Curso: " + getCurso().getTitulo() + " - Professor: " + getCurso().getProfessor().getNome() + " - Forma de pagamento: " + getFormaPag() +" - Valor Total: " + getValorPagarCurso();
	}

	private double valorPagarCurso;
	private Curso curso;
	private FormPag formaPag;
	
	public Aluno(String nome, int cpf, Curso curso, FormPag formaPag) {
		super(nome, cpf);
		this.curso = curso;
		this.formaPag = formaPag;
	}

	public double getValorPagarCurso() {
		if(formaPag == FormPag.A_VISTA) {
			valorPagarCurso = (curso.getQtdHorasCurso()*curso.getValorHoraCurso())+curso.getQtdHorasCurso()*curso.getValorHoraCurso()*formaPag.getJuros();
		} else if(formaPag == FormPag.CARNE) {
			valorPagarCurso = (curso.getQtdHorasCurso()*curso.getValorHoraCurso())+curso.getQtdHorasCurso()*curso.getValorHoraCurso()*formaPag.getJuros();
		} else {
			valorPagarCurso = (curso.getQtdHorasCurso()*curso.getValorHoraCurso())+curso.getQtdHorasCurso()*curso.getValorHoraCurso()*formaPag.getJuros();
		}
		return valorPagarCurso;
	}

	public void setValorPagarCurso(double valorPagarCurso) {
		this.valorPagarCurso = valorPagarCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public FormPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormPag formaPag) {
		this.formaPag = formaPag;
	}

}
