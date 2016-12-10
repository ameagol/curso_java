package aula1;

import java.util.Scanner;

public class ComparaStrings {

	public static void main(String[] args) {

		System.out.println("Digite a primeira String");
		Scanner scanner = new Scanner(System.in);
		String primeiraString = scanner.next();
		
		System.out.println("Digite a segunda String");
		Scanner scanner2 = new Scanner(System.in);
		String segundaString = scanner2.next();
		
		if(primeiraString.equals(segundaString)){
			System.out.println("As strings são iguais: " + primeiraString + " " + segundaString);
		}else{
			System.out.println("As Strings Sao diferentes "  + primeiraString + " " + segundaString);
		}

		scanner.close();
		scanner2.close();

	}

}
