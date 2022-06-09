
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	// Criando atributos privados a fim de que outras classes nao interajam com esses atributos
	private int dia;
	private int mes;
	private int ano;
	// Aqui foi colocado -1, pois como nao existe essa hora nao havera conflito na hora de executar o codigo
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	// Construtor que recebe dia mes e ano
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		//  construtor que recebe todos os valores
		this (dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	
	public void imprimir(int formato) {
		//  coloca a data de forma visual na tela
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			
			// Prentando a data
			System.out.println(data);
		} else {
			
			String horario = ":" + minuto + ":" + segundo;
			// Formatacao do hora para formato 24H
			if (formato == FORMATO_24H) {
				
				horario = hora + horario;
			} else {
				
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				// Formatacao para hora 12H
				} else if (hora >= 12) {
					 
					horario = (hora - 12) + horario;
					horario += " PM";
				
				} else {
					
					horario = hora + horario;
					horario += " AM";
				}
			}

			
			System.out.println(data + " " + horario);// Mostra a hora formatada na tela
		}
	}

	// Getters 
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
}
