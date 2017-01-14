package br.com.dextraining.calendarioenum;

public class Data {

	private Mes mes;
	private int dia;
	private int ano;

	public Data(int dia,Mes mes,int ano){
		
		if(!mes.diaValido(dia, ano)){
			throw new IllegalArgumentException("Data Invalida!");
		}
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	@Override
	public String toString(){
		return dia + "/" + mes.ordinal() + 1 + "/" + ano;
	}
	

}
