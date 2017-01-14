package br.com.dextraining.list;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoa {
	public static void main(String[] args) {
		
		List<Pessoa> minhaLista = new ArrayList<Pessoa>();
		Pessoa ricardo = new Pessoa("Ricardo",1010101);
		Pessoa paulo = new Pessoa("Paulo",2020202);
		
		
		minhaLista.add(ricardo);
		minhaLista.add(paulo);

	
		for(Object pessoa: minhaLista){
			System.out.println(pessoa.toString());
		}
		
		System.out.println("Minha lista tem: " + minhaLista.size() + " elementos");

	}
}
