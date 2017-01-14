package br.com.dextraining.pedagio;

public class Caminhao extends Veiculo implements PagaPedagio {

	private int totalEixos = 5;
	
	public int totalEixos() {
		return setEixos(totalEixos);
	}

	

}
