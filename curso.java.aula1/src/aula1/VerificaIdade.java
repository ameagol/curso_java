package aula1;

import java.util.Scanner;

public class VerificaIdade {

	public static void main(String[] args) {

		System.out.println("Digite sua idade");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		/*
		 * if(idade > 18){
			System.out.println("Maior de Idade");
		}else{
			System.out.println("Menor de idade");
		}
		 */
		
		String validar = idade > 18 ? "Maior de idade" : "Menor de idade ";

		System.out.println(validar);
		scanner.close();
	}

}
