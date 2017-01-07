package br.com.dextraining.pessoa;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o nome:");
		String nome = scanner.nextLine();
		System.out.println("Informe o rg:");
		int rg		= scanner.nextInt();
		System.out.println("Informe o cpf:");
		int cpf		= scanner.nextInt();
		

		Pessoa pessoa = new Pessoa(nome,rg,cpf);
		
		System.out.println(pessoa.toString());
		
		scanner.close();
	}

}
