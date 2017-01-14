package br.com.dextraining.pedagio;

public class CalculadorPedagio {

	private double precoPorEixo;
	
	public double calcular(PagaPedagio veiculo){
		
		return veiculo.totalEixos() * precoPorEixo;
	}
}
