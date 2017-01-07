package br.com.dextraining.arrays;

import java.util.Scanner;

public class MediaEmArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double valores[] = new Double[3];
		Double valor = 0.0;
		
		for(int i = 0; i < valores.length; i ++){
		System.out.println("Digite a " + i + "o Valor:");
		valores[i] = scanner.nextDouble();
		}
		
		for(int j = 0; j < valores.length; j ++){
			valor += valores[j];
		}
		
		System.out.println("O valor da Media é:" + valor/3);
		scanner.close();

	}

}
