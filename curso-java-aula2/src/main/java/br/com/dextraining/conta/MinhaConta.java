package br.com.dextraining.conta;

import java.util.Scanner;

public class MinhaConta {
	
	static int saldo = 1000;
	static int valorSaque = 0;
	static int valorDeposito = 0;
	static boolean resultado;

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		int opcao = mostrarMenu(scanner);
		Conta conta = new Conta();
		
		while(opcao != 4){
			
			switch(opcao){
			case 1: 
				System.out.println("Digite o valor do Saque");
				valorSaque = scanner.nextInt();
				
				resultado = conta.sacar(valorSaque);
				
				if(resultado == true)
					System.out.println("Saque Realizado:" + valorSaque + " Reais " + "Saldo em conta" + conta.verSaldo());
				else
					System.out.println("Saldo insuficiente" + conta.verSaldo());
				
			break;
			
			case 2: 
				System.out.println("Digite o valor do Deposito");
				valorDeposito = scanner.nextInt();
				
				resultado = conta.depositar(valorDeposito);
				
				if(resultado == true)
					System.out.println("Deposito Realizado:" + valorDeposito + " Reais " + "Saldo em conta" + conta.verSaldo());
				else
					System.out.println("Falha ao depositar" + conta.verSaldo());
			break;
			case 3: 
				
				System.out.println("Saldo em Conta:" + conta.verSaldo());
			
			break;
			case 4: System.exit(2); break;
			}
			
			opcao = mostrarMenu(scanner);
		}

	}

	public static int mostrarMenu(Scanner scanner) {
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Ver Saldo");
		System.out.println("4 - Sair");
		System.out.println();
		return scanner.nextInt();
	}

}
