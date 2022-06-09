
public class Cliente extends Usuario {

	private Double valorPagarServico;
	private Servico servico;
	FormaPag formaPag;

	public Cliente(String nome, int cpf, Servico servico, FormaPag formaPag) {
		super(nome, cpf);

		this.servico = servico;
		this.formaPag = formaPag;
	}

	public Double getValorPagarServico() {
//		if(formaPag == FormaPag.A_VISTA0) {
//			valorPagarServico = (servico.getValorHoraServico()*servico.getQtdHorasServico()+servico.getMecanico().getMaoDeObra()+formaPag.getJuros());
//			else if(formaPag == FormaPag.CARNE0) {
//				valorPagarServico = (servico.getValorHoraServico()*servico.getQtdHorasServico()+servico.getMecanico().getMaoDeObra()+formaPag.getJuros());
//			} else {
//				valorPagarServico = (servico.getValorHoraServico()*servico.getQtdHorasServico()+servico.getMecanico().getMaoDeObra()+formaPag.getJuros());
//			
//			}
//		
		return valorPagarServico;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}

	@Override
	public String toString() {
		return "Cliente [valorPagarServico=" + valorPagarServico + ", servico=" + servico + ", formaPag=" + formaPag
				+ "]";
	}
}
