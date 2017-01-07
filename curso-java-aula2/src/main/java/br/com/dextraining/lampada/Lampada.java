package br.com.dextraining.lampada;

public class Lampada {
	
	int watts;
	String Fabricante;
	boolean status = false;
	
	public Lampada(int watts, String fabricante) {
		this.watts = watts;
		Fabricante = fabricante;
	}
	
	public boolean ligar(){
		System.out.println("Lampada desligada, Ligando a Lampada...");
		return this.status = true;
		
	}
	
	public boolean desligar(){

		System.out.println("Lampada Ligada, Desligando...");
		return this.status = false;
	}
	
	public boolean getStatus(){
		
		return this.status;
	}

}
