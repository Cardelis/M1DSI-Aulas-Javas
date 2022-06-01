
public class Mouse {

	
	// criando atributos de mouse
		private String funciona;
		private String qtdBotoes;
		private String tamanho;
		
		
		// constroi na memoria RIP um novo mouse cada vez que dou NEW


		public Mouse(String texto) {
			String[] arrayAuxiliar1 = texto.split(",");
			String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");// split: ele quebra a string onde este uma (,)
			this.funciona = arrayAuxiliar2[1].trim(); // trim: 

			String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
			this.qtdBotoes = arrayAuxiliar3[1].trim();

			String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
			this.tamanho = arrayAuxiliar4[1].trim();
		}


		public Mouse(String funciona, String qtdBotoes, String tamanho) {
			super();
			this.funciona = funciona;  //estamos dizendo que queremos atribuir ao atributo funciona
			this.qtdBotoes = qtdBotoes; //estamos dizendo que queremos atribuir ao atributo qtdBotoes
			this.tamanho = tamanho;  //estamos dizendo que queremos atribuir ao atributo tamanho
		}


		@Override  //é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
		public String toString() {
			return "Mouse: funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho ;
		}
		


	
}
