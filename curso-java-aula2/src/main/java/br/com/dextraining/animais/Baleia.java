package br.com.dextraining.animais;

public class Baleia extends Mamifero implements AnimalExaminavel{

	public void emitirSom(){
		System.out.println("iiiiii");
	}
	
	public void examinar(){
		emitirSom();
	}
}
