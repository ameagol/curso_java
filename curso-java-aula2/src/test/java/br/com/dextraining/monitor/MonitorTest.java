package br.com.dextraining.monitor;
import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Monitor;


public class MonitorTest {

	Monitor monitor;
	
	@Test
	public void testarCriacaoMonitor(){
		
		monitor = new Monitor(20,"1","PRETO");
		monitor.cor = "preta";
		monitor.polegadas = 20;
		monitor.numeroSerie = "1234AB";

		Assert.assertNotNull(monitor);
		Assert.assertNotNull(monitor.cor);
		Assert.assertFalse(monitor.ligado);
		Assert.assertEquals(20, monitor.polegadas);
	}
	
	@Test
	public void testarMaxBrilho(){
		monitor = new Monitor();
		
		for(int i = 0; i < 101; i++){
			monitor.aumentarBrilho();
		}
		
		Assert.assertEquals(100, monitor.brilho);
	}
}
