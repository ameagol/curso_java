package br.com.dextraining.equipamento;

public class Equipamento {

	private Double preco;
	private String fabricante;
	
	public Equipamento(Double preco,String fabricante){
		this.preco = preco;
		this.fabricante = fabricante;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public Double calculaPreco(){
		return this.preco;
	}
	
}
