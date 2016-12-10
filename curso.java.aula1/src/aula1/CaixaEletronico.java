package aula1;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		

		System.out.println("Digite o Valor a ser sacado");
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		
		int cedula100 = valor / 100;
		valor = valor % 100;
		
		int cedula50 = valor / 50;
		valor = valor % 50;
		
		int cedula20 = valor / 20;
		valor = valor % 20;
		
		int cedula10 = valor / 10;
		valor = valor % 10;
		
		int cedula5 = valor / 5;
		valor = valor % 5;
		
		if(valor != 0){
			System.out.println("Valor Incorreto");
		}else{
			if(cedula100 > 0){
	
				System.out.println("Cedulas de 100:" + cedula100);
			}
	
			if(cedula50 > 0){
				System.out.println("Cedulas de 50:" + cedula50);
			}
			
			if(cedula20 > 0){
				System.out.println("Cedulas de 20:" + cedula20);
			}
			
	
			if(cedula10 > 0){
				System.out.println("Cedulas de 10:" + cedula10);
			}
			
	
			if(cedula5 > 0){
				System.out.println("Cedulas de 5:" + cedula5);
			}
		}
		scanner.close();
	}

}
