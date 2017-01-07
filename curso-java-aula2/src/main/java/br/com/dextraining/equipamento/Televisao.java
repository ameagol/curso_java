package br.com.dextraining.equipamento;

public class Televisao extends Equipamento{

	private int polegadas;
	public Televisao(Double preco,String fabricante,int polegadas){
		super(preco,fabricante);
		this.polegadas = polegadas;
	}
	
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	
	 
}
