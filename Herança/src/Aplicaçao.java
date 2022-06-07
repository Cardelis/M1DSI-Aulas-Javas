
public class Aplicaçao { //Super classe

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo(); // instanciado um objeto veiculo com esse objeto eu consigo chamar os metodos setters para accesar aos atributos criados na classe veiculo
		
		
                
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2015);

		veiculo.imprimir();
		veiculo.buzinar();

		Carro carro = new Carro(); // Instanciando objeto carro
                // herda tambem seus metodos e atributos, a mesma coisa vale para a moto e o caminhao
		carro.setMarca("Chevrolet");
		carro.setModelo("Aveo");
		carro.setAno(2012);

		System.out.println(); // pula linha

		carro.imprimir();
		carro.buzinar();

		Caminhao caminhao = new Caminhao(); 
               
		caminhao.setMarca("SCANIA");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);

		System.out.println(); // pula linha

		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setModelo("Remaza");
		moto.setAno(2015);
		
		System.out.println(); // pula linha
		
		moto.imprimir();
		moto.buzinar();
	}

}
