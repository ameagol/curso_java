package br.com.dextraining.calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	
	@Test
	public void testarSoma(){
		double resultado = calculadora.somar(10, 15);
		Assert.assertEquals(Double.valueOf(25), Double.valueOf(resultado));
	}
	
	@Test
	public void testarSubtraçao(){
		double resultado = calculadora.subtrair(10, 5);
		Assert.assertEquals(Double.valueOf(5), Double.valueOf(resultado));
	}
	
	@Test
	public void testarDivisao(){
		double resultado = calculadora.dividir(10, 5);
		Assert.assertEquals(Double.valueOf(2), Double.valueOf(resultado));
	}
	
	@Test
	public void multiplicacao(){
		double resultado = calculadora.multiplicar(10, 15);
		Assert.assertEquals(Double.valueOf(150), Double.valueOf(resultado));
	}
	
}
