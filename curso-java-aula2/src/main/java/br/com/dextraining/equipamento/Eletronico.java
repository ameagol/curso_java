package br.com.dextraining.equipamento;

public class Eletronico extends Equipamento {

	public Eletronico(Double preco,String fabricante){
		super(preco,fabricante);
	}
	
	@Override
	public Double calculaPreco(){
		return (double) Math.round(super.calculaPreco() * 1.10);
	}
	
	
}
