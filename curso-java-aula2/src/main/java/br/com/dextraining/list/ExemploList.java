package br.com.dextraining.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		List<String> minhaLista = new ArrayList<String>();
		
		minhaLista.add("Primeiro");
		minhaLista.add("Segundo");
		minhaLista.add("Terceiro");
		minhaLista.add("Quarto");
		minhaLista.add(2, "Novo Elemento na posiçao 2");
		
		minhaLista.remove("Terceiro");
		for(Object valor: minhaLista){
			System.out.println(valor);
		}
		
		System.out.println("Minha lista tem: " + minhaLista.size() + " elementos");

	}

}
