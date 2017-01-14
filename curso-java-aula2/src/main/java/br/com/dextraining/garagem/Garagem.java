package br.com.dextraining.garagem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Garagem {

	Map<String,Veiculo> veiculosCadastrados = new HashMap<String,Veiculo>();
	
	public boolean addVeiculo(Veiculo veiculo){
		
		if(veiculosCadastrados.containsKey(veiculo.getPlaca())){
			return false;
		}else{
			veiculosCadastrados.put(veiculo.getPlaca(), veiculo);
			return true;
		}
		
	}
	
	public void listarVeiculos(){

		Set<Entry<String,Veiculo>> entrySet = veiculosCadastrados.entrySet();
		
		for(Entry<String,Veiculo> veiculo: entrySet){
			System.out.println(veiculo);
		}
	}

	public Veiculo buscarVeiculo(String placa) {
		
		return veiculosCadastrados.get(placa);
		
	}
	
	public Veiculo removerVeiculo(String placa){
		return veiculosCadastrados.remove(placa);

	}

}
	
