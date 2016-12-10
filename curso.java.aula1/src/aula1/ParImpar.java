package aula1;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		System.out.println("Digite o numero");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		
		int resultado = numero % 2;
		
		System.out.println(resultado == 0 ? "Numero Par" : "Numero Impar");

		scanner.close();
	}

}
