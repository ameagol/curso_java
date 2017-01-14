package br.com.dextraining.calendarioenum;

public enum Mes {

	JANEIRO(31),
	FEVEREIRO(28){
		@Override
		public boolean diaValido(int dia,int ano){
			//
			//Validar se é valido, caso seja ano bisexto
			return super.diaValido(dia, ano);
		}
	},
	MARCO(30),
	ABRIL(31),
	MAIO(30),
	JUNHO(31),
	JULHO(30),
	AGOSTO(31),
	SETEMBRO(30),
	OUTUBRO(31),
	NOVEMBRO(30),
	DEZEMBRO(31);
	
	private Mes(int quantidadeDias){
		this.quantidadeDias = quantidadeDias;
	}
	
	private int quantidadeDias;
	
	public boolean diaValido(int dia,int ano){
		if(dia <= 0){
			return false;
		}
		return dia <= quantidadeDias;
	}
	
	
}
