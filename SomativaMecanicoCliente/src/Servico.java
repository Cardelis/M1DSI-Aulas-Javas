
public class Servico {

	private String nomeServico;
	private Double qtdHorasServico;
	private Double valorHoraServico;
	private Mecanico mecanico;

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Double getQtdHorasServico() {
		return qtdHorasServico;
	}

	public void setQtdHorasServico(Double qtdHorasServico) {
		this.qtdHorasServico = qtdHorasServico;
	}

	public Double getValorHoraServico() {
		return valorHoraServico;
	}

	public void setValorHoraServico(Double valorHoraServico) {
		this.valorHoraServico = valorHoraServico;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public Servico(String nomeServico, Double qtdHorasServico, Double salarioMecanivo, Mecanico mecanico) {

		this.nomeServico = nomeServico;
		this.qtdHorasServico = qtdHorasServico;
		this.valorHoraServico = salarioMecanivo;
		this.mecanico = mecanico;

	}

	@Override
	public String toString() {
		return "Servico [nomeServico=" + nomeServico + ", qtdHorasServico=" + qtdHorasServico + ", valorHoraServico="
				+ valorHoraServico + ", mecanico=" + mecanico + "]";
	}

}
