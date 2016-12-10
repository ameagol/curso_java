package aula1;

import java.util.Scanner;

public class JogoParImpar {

	public static void main(String[] args) {

		System.out.println("Digite o Nome do 1o Jogador");
		Scanner scanner = new Scanner(System.in);
		String jogador1 = scanner.next();

		System.out.println("Digite o Nome do 2o Jogador");
		Scanner scanner2 = new Scanner(System.in);
		String jogador2 = scanner2.next();
		

		System.out.println("Digite o numero do 1o Jogador");
		Scanner escolha1 = new Scanner(System.in);
		int escolhaJogador1 = escolha1.nextInt();
		
		System.out.println("Digite o numero do 2o Jogador");
		Scanner escolha2 = new Scanner(System.in);
		int escolhaJogador2 = escolha2.nextInt();
		
		int resultado = escolhaJogador1 + escolhaJogador2;
		
		System.out.println(resultado % 2 == 0 ? "Jogador " + jogador1 + " Venceu" : "Jogador " + jogador2 + " Venceu");

		scanner.close();
		scanner2.close();
		escolha1.close();
		escolha2.close();
	}

}
