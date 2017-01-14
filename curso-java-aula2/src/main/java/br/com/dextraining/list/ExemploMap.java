package br.com.dextraining.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {
		
		Map<String,Pessoa> pessoas = new HashMap<String,Pessoa>();
		
		pessoas.put("10101010", new Pessoa("Ricardo",10101010));
		pessoas.put("20202020", new Pessoa("Joe",20202020));
		
		Set<Entry<String,Pessoa>> entrySet = pessoas.entrySet();
		
		for(Entry<String,Pessoa> entry: entrySet){
			System.out.println(entry);
		}
		
	}

}
