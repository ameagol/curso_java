package br.com.dextraining.animais;

public class Jacare extends Reptil implements AnimalExaminavel{

	public void emitirSom(){
		System.out.println("eeeeee");
	}
	
	public void examinar(){
		emitirSom();
	}
}
