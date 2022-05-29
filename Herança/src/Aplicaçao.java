
public class Aplicaçao { //Super classe

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo(); // Instanciando objeto
		
		
                
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2015);

		veiculo.imprimir();
		veiculo.buzinar();

		Carro carro = new Carro(); // Instanciando objeto
                // metodo set de carro
		carro.setMarca("Chevrolet");
		carro.setModelo("Aveo");
		carro.setAno(2012);

		System.out.println();

		carro.imprimir();
		carro.buzinar();

		Caminhao caminhao = new Caminhao(); // Instanciando objeto
                // metodo set de caminhao
		caminhao.setMarca("SCANIA");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);

		System.out.println();

		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto(); // Instanciando objeto
		
		moto.setMarca("Honda");
		moto.setModelo("Remaza");
		moto.setAno(2015);
		
		System.out.println();
		
		moto.imprimir();
		moto.buzinar();
	}

}
