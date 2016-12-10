package aula1;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		System.out.println("Digite mes do Ano");
		Scanner scanner = new Scanner(System.in);
		int mes = scanner.nextInt();

		
		switch(mes){
		
		case 1: System.out.println("Janeiro"); 
		case 2: System.out.println("Feverei"); 
		case 3: System.out.println("Marco"); 
		case 4: System.out.println("Abril"); 
		case 5: System.out.println("Maio"); 
		case 6: System.out.println("Junho"); 
		case 7: System.out.println("Julho"); 
		case 8: System.out.println("Agosto"); 
		case 9: System.out.println("Setembro"); 
		case 10: System.out.println("Outubro"); 
		case 11: System.out.println("Novembro"); 
		case 12: System.out.println("DEzembro");break;
		default : System.out.println("Mes INvalido"); 
		
		}
		
		scanner.close();

	}

}
