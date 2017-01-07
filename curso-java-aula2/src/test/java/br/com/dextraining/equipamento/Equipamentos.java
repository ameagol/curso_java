package br.com.dextraining.equipamento;

import org.junit.Assert;
import org.junit.Test;

public class Equipamentos {

	@Test
	public void testarTelevisao(){
		Televisao televisao = new Televisao(100.0,"LG",50);
		double resultado = televisao.calculaPreco();
		
		Assert.assertEquals(Double.valueOf(110.0),Double.valueOf(resultado));
	}
}
