
public enum FormaPag {
	
	A_VISTA0(-0.1),
	CARNE0(0.05),
	CARTAO(0.1);
	
	public double getJuros() {
		return juros;
	}

	private double juros;

	
	private FormaPag(double juros) {
		this.juros = juros;
		
	}
	
	
	
	
}


