package br.com.dextraining.conta;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {
	
	@Test
	public void testSaque(){
		
		Conta conta = new Conta();
		
		conta.sacar(100);
		
		Assert.assertEquals(Double.valueOf(900), Double.valueOf(conta.verSaldo()));
		
	}
	

}
