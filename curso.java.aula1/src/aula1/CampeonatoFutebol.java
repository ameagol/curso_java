package aula1;

import java.util.Scanner;

public class CampeonatoFutebol {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int golsA = 0;
		int golsB = 0;
		int vitoriaA = 0;
		int vitoriaB = 0;
		int sofridosA = 0;
		int sofridosB = 0;
		
		System.out.println("Digite a quantidade de Jogos");
		int jogos = scanner.nextInt();
		
		System.out.println("Digite o nome do time A");
		String timeA = scanner.next();
		
		System.out.println("Digite o nome do time B");
		String timeB = scanner.next();
		
		while (i < jogos){
			
			System.out.println("Digite os gols do " + timeA + "  no jogo " + i);
			 golsA = scanner.nextInt();
			
			System.out.println("Digite os gols do " + timeB + " no jogo " + i);
			golsB = scanner.nextInt();
			
			if(golsA > golsB) 
				vitoriaA++;
			else 
				vitoriaB++;
			
			sofridosA += golsB;
			sofridosB += golsA;
			
			golsA = 0;
			golsB = 0;
			
			i++;
		}
		
		System.out.println("Time:" + timeA);
		System.out.println("gols sofridos: "+ sofridosA);
		System.out.println("Vitorias: "+ vitoriaA);
		
		System.out.println("Time:" + timeB);
		System.out.println("gols sofridos: "+ sofridosB);
		System.out.println("Vitorias: "+ vitoriaB);
		
		if(vitoriaA > vitoriaB){
			System.out.println("O Maior vencedor eh o " + timeA);
		}else{
			System.out.println("O Maior vencedor eh o " + timeB);
		}
		scanner.close();

	}

}
