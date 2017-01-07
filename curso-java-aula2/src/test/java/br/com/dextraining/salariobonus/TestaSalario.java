package br.com.dextraining.salariobonus;

import org.junit.Assert;
import org.junit.Test;


public class TestaSalario {

	@Test
	public void testaSalario(){
		double resultado;
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Ricardo");
		funcionario.setCargo("Programado");
		funcionario.setSalario(1);
		funcionario.setPorcentagemBonificacao(10);
		
		resultado = funcionario.getSalario();
		
		Assert.assertEquals(Double.valueOf(funcionario.getSalario()), Double.valueOf(resultado));
		
	}
}
