package aula1;

import java.util.Scanner;

public class ordemNumerica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o 1o valor");
		int a = scanner.nextInt();

		System.out.println("Digite o 2o valor");
		int b = scanner.nextInt();

		System.out.println("Digite o 3o valor");
		int c = scanner.nextInt();
		int menor = 0;int maior = 0;

		if(a > b){
			maior = a;
			menor = b;
		}else{
			maior = b;
			menor = a;
		}
		
		if(c >= maior){
			System.out.println(c +" "+ maior +" "+ menor);
		}else if ( c>= menor){
			System.out.println(maior +" "+ c +" "+ menor);
		}else{
			System.out.println(maior +" "+ menor +" "+ c);
		}
		
		scanner.close();

	}

}
