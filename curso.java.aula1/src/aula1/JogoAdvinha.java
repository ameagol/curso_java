package aula1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int random = new Random().nextInt(10) + 1;
		int i = 0;
		int tentativas = 0;
		

		while(i <= 10){
			
		System.out.println("Digite um numero");
		int numero = scanner.nextInt();
		
			
			tentativas++;
			if(numero == random){
				System.out.println("Acertou o numero " + numero + " em " + tentativas + " tentativas");
				break;
			}else{
				System.out.println("Errou");
			}
			i++;
		}
		
		scanner.close();

	}

}
