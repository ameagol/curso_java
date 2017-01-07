package br.com.dextraining.televisao;

public class Televisao {
	
	private boolean ligada;
	private int volume;
	private int voltagem;
	private int canal;
	private boolean tela;
	private int diodo;
	
	public void ligar(){
		System.out.println("Ligando a TV ");
	}
	
	public void desligar(){

		System.out.println("DEsligando a TV ");
	}
	
	public void aumentarVolume(){
		System.out.println("Aumentando Volume");
	}
	
	public void diminuirVolume(){
		System.out.println("Diminuir Volume");
	}
	
	public void ajustarVoltagem(){
		System.out.println("Ajustando Voltagem");
	}
	
	public void aumentarCanal(){
		System.out.println("Aumentando Canal");
	}
	
	public void diminuirCanal(){
		System.out.println("Diminuindo Canal");
	}
	
	private void ligarTela(){

		System.out.println("Ligando Tela");
	}
	
	private void regularDiodo(){

		System.out.println("Ajustando Diodo");
	}

}
