package aula1;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		
		System.out.println("Digite dia da semana");
		Scanner scanner = new Scanner(System.in);
		int dia = scanner.nextInt();
		String diaSemana = null;
		
		switch(dia){
		
		case 1: diaSemana = "Segunda"; break;
		case 2: diaSemana = "Terça"; break;
		case 3: diaSemana = "Quarta"; break;
		case 4: diaSemana = "Quinta"; break;
		case 5: diaSemana = "Sexta"; break;
		case 6: diaSemana = "Sabado"; break;
		case 7: diaSemana = "Domingo"; break;
		default: diaSemana = "Invalido"; break;
		
		}
		
		System.out.println("Dia da semana " + dia + " eh: " + diaSemana) ;
		
		scanner.close();

	}

}
