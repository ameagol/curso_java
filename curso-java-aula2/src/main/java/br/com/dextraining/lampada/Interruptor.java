package br.com.dextraining.lampada;

public class Interruptor {

	boolean status = false;
	
	public boolean Testar(Lampada lampada){
		
		this.status = lampada.getStatus();
		
		if(this.status = true)
			return lampada.desligar();
		else
			return lampada.ligar();
		
	}
	
	
}
