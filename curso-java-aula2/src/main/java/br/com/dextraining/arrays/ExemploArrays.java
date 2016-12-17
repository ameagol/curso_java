package br.com.dextraining.arrays;

public class ExemploArrays {

	public static void main(String[] args) {
		int tamanho = 5;
		//int valores[] = new int[tamanho];
		int outrosValores[] = { 1,2,3,4,5 };
		//String nomes[] = new String[tamanho];
				
		for (int i = 0; i < tamanho; i++){
			System.out.println("[" + i + "]" + outrosValores[i]);
		}

	}

}
