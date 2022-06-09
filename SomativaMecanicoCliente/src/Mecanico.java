
public class Mecanico extends Usuario {

	private Double maoDeObra;

	

	public Double getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(Double maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	public Mecanico(String nome, int cpf, Double maoDeObra) {
		super(nome, cpf);
		this.maoDeObra = maoDeObra;
	}
}
