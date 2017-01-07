package br.com.dextraining.lampada;

import java.util.Scanner;

public class TestaLampada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os Watts");
		int watts = scanner.nextInt();
		
		System.out.println("Digite o Fabricante");
		String fabricante = scanner.next();
		
		Lampada lampada = new Lampada(watts,fabricante);
		
		Interruptor interruptor = new Interruptor();
		
		System.out.println(interruptor.Testar(lampada));
		
		scanner.close();

	}

}
